package dao;

import dao.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

public class CategoryDAOImpl implements CategoryDAO {


    @Override
    public void delCategory(int ID_CATEGORY) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "DELETE FROM CATEGORY WHERE ID_CATEGORY ='" + ID_CATEGORY
                + "'";
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Category getCategoryName(String  name) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM CATEGORY WHERE NAME='" + name + "'";
        Category c = new Category();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ma_the_loai = Integer.parseInt(rs.getString("ID_CATEGORY").trim());
                String ten_the_loai = rs.getString("NAME");
                String mo_ta = rs.getString("DESCRIPTION");
                c = new Category(ma_the_loai, ten_the_loai, mo_ta);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public void addCategory(Category c) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "INSERT INTO CATEGORY VALUES(?,?,?)";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, c.getID_CATEGORY());
            ps.setString(2, c.getNAME());
            ps.setString(3, c.getDESCRIPTION());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Category> getList() {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM CATEGORY";
        List<Category> list = new ArrayList<Category>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                int id = Integer.parseInt(rs.getString("ID_CATEGORY"));
                int id=rs.getInt("ID_CATEGORY");
                String name = rs.getString("NAME");
                String description = rs.getString("DESCRIPTION");
                list.add(new Category(id, name, description));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateCategory(Category c) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "UPDATE CATEGORY SET NAME=?, DESCRIPTION=? WHERE ID_CATEGORY=?";
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.setString(1, c.getNAME());
            ps.setString(2, c.getDESCRIPTION());
            ps.setInt(3, c.getID_CATEGORY());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        CategoryDAOImpl ca=new CategoryDAOImpl();
        System.out.println(ca.getCategoryName("Blue T-shirt").getID_CATEGORY());
    }

    @Override
    public Category getCategory(int id) {
         Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM CATEGORY WHERE ID_CATEGORY='" + id + "'";
        Category c = new Category();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ma_the_loai = Integer.parseInt(rs.getString("ID_CATEGORY").trim());
                String ten_the_loai = rs.getString("NAME");
                String mo_ta = rs.getString("DESCRIPTION");
                c = new Category(ma_the_loai, ten_the_loai, mo_ta);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

}