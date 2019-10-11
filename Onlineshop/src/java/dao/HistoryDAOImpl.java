package dao;

import dao.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Category;
import model.History;
import model.Command;
import model.Product;

public class HistoryDAOImpl implements HistoryDAO {

    @Override
    public List<Command> getList(int id) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM COMMAND_PRODUCT WHERE ID_CUSTOMER='" + id + "'";
        List<Command> list = new ArrayList<Command>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ID_PRODUCT = rs.getInt("ID_PRODUCT");
                int ID_COMMAND = rs.getInt("ID_COMMAND");
                double TOTAL = rs.getDouble("TOTAL");
                int QUANTITY = rs.getInt("QUANTITY");
                Timestamp BUY_DATE = rs.getTimestamp("BUY_DATE");
                int ID_CUSTOMER = rs.getInt("ID_CUSTOMER");
                list.add(new Command(ID_PRODUCT, ID_COMMAND, TOTAL, QUANTITY, BUY_DATE, ID_CUSTOMER));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /*add into COMMAND before add into COMMAND_PRODUCT*/
    @Override
    public void addHistory(Command c) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "INSERT INTO COMMAND_PRODUCT VALUES(?,?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setInt(1, c.getID_PRODUCT());
            ps.setInt(2, c.getID_COMMAND());
            ps.setDouble(3, c.getTOTAL());
            ps.setInt(4, c.getQUANTITY());
            ps.setTimestamp(5, c.getBUY_DATE());
            ps.setInt(6, c.getID_USER());

            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Integer> getId() {
        List<Integer> listId = null;
        try {
            listId = new ArrayList<Integer>();
            Connection con = null;

            con = DBConnect.getDBConnection();

            String sql = "SELECT ID_COMMAND FROM COMMAND";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listId.add(rs.getInt("ID_COMMAND"));
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listId;
    }

    @Override
    public int genarateId(int min, int max) {
        /*random id*/
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        ProductDAOImpl productDao = new ProductDAOImpl();
        /*if id exists then call genarateId() method again else break and return x*/
        for (Integer i : productDao.getId()) {
            if (i == x) {
                genarateId(min, max);
            } else {
                break;
            }
        }
        return x;
    }

    @Override
    public void addOrder(Command c) {

        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "INSERT INTO COMMAND VALUES(?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, c.getID_COMMAND());
            ps.setInt(2, c.getID_USER());
            ps.setTimestamp(3, c.getBUY_DATE());
            ps.setString(4, "");
            ps.setBoolean(5, c.isINDEXCHECK());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Boolean> getIndexCheck() {
        List<Boolean> listIndex = null;
        try {
            listIndex = new ArrayList<Boolean>();
            Connection con = null;

            con = DBConnect.getDBConnection();

            String sql = "SELECT INDEXCHECK FROM COMMAND WHERE INDEXCHECK=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listIndex.add(rs.getBoolean("INDEXCHECK"));
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listIndex;
    }

    @Override
    public void updateCommandTable(Command c) {
        Connection dbConnection = null;
        PreparedStatement ps = null;
        String updateTableSQL = "UPDATE COMMAND SET ID_CUSTOMER = ?,COMMAND_DATE = ?,INDEXCHECK= ? WHERE ID_COMMAND = ?";
        try {
            dbConnection = DBConnect.getDBConnection();
            ps = dbConnection.prepareStatement(updateTableSQL);
            ps.setInt(4, c.getID_COMMAND());
            ps.setInt(1, c.getID_USER());
            ps.setTimestamp(2, c.getBUY_DATE());
            ps.setBoolean(3, c.isINDEXCHECK());
            ps.executeUpdate();
            System.out.println("Record is updated to COMMAND table!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Command> getListCommand() {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM COMMAND WHERE INDEXCHECK=?";
        List<Command> list = new ArrayList<Command>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.setBoolean(1, false);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Command c = new Command();
                int ID_COMMAND = Integer.parseInt(rs.getString("ID_COMMAND").trim());
                int ID_CUSTOMER = Integer.parseInt(rs.getString("ID_CUSTOMER").trim());
                Timestamp COMMAND_DATE = rs.getTimestamp("COMMAND_DATE");
                boolean index = rs.getBoolean("INDEXCHECK");
                list.add(new Command(ID_COMMAND, ID_CUSTOMER, COMMAND_DATE, index));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public Command getCommand(int id) {

        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM COMMAND WHERE ID_COMMAND=?";
        Command c = null;
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Command(Integer.parseInt(rs.getString("ID_COMMAND").trim()),
                        Integer.parseInt(rs.getString("ID_CUSTOMER").trim()),
                        rs.getTimestamp("COMMAND_DATE"), rs.getBoolean("INDEXCHECK"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(HistoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;
    }

    public static void main(String[] args) throws ParseException, ParseException {
        HistoryDAOImpl h = new HistoryDAOImpl();
        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp tdate = new java.sql.Timestamp(calendar.getTime().getTime());
        Command c = new Command(1, 980, 1000000, 2, tdate, 3);
//        h.addHistory(c);
//        System.out.println(h.getList(3));
//        System.out.println(h.genarateId(0, 1000));
//        h.addOrder(c);
//        h.addHistory(c);
        System.out.println(h.getListCommand());
//        System.out.println(h.getIndexCheck());
//        h.updateCommandTable(c);
//        System.out.println(h.getCommand(357));

    }

}
