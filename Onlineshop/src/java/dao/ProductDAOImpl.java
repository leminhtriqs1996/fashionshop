package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Product;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public void addProduct(Product p) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "INSERT INTO PRODUCT VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, p.getID_PRODUCT());
            ps.setString(2, p.getNAME());
            ps.setString(3, p.getSize());
            ps.setString(4, p.getColor());
            ps.setString(5, p.getCountry());
            ps.setDouble(6, p.getPRICE());
            ps.setInt(7, p.getQuantity_remaining());
            ps.setString(8, p.getGender());
            ps.setInt(9, p.getCommand_quantity());
            ps.setString(10, p.getKindOfFabric());
            ps.setString(11, p.getIMAGE());
            ps.setInt(12, p.getID_CATEGORY());
            ps.setString(13, p.getSUPPLIER());
            ps.setString(14, p.getINFORMATION());

            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> getList() {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM PRODUCT";
        List<Product> list = new ArrayList<Product>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ma_san_pham = Integer.parseInt(rs.getString("ID_PRODUCT").trim());
                int ma_the_loai = Integer.parseInt(rs.getString("ID_CATEGORY").trim());
                String ten_san_pham = rs.getString("NAME");
                String hinh_anh = rs.getString("IMAGES");
                Double gia_ban = rs.getDouble("PRICE");
                String hang_san_xuat = rs.getString("SUPPLIER");
                String thong_tin = rs.getString("INFORMATION");
                list.add(new Product(ma_san_pham, ma_the_loai, ten_san_pham,
                        hinh_anh, gia_ban, hang_san_xuat, thong_tin));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> getListByCategory(int id) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM PRODUCT WHERE ID_CATEGORY='" + id + "'";
        List<Product> list = new ArrayList<Product>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ma_san_pham = rs.getInt("ID_PRODUCT");
                int ID_CATEGORY = rs.getInt("ID_CATEGORY");
                String NAME = rs.getString("NAME");
                String IMAGES = rs.getString("IMAGES");
                double PRICE = rs.getDouble("PRICE");
                String hang_san_xuat = rs.getString("SUPPLIER");
                String thong_tin = rs.getString("INFORMATION");
                list.add(new Product(ma_san_pham, ID_CATEGORY, NAME, IMAGES, PRICE, hang_san_xuat, thong_tin));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> searchList(String ten_san_pham, String ten_the_loai) {
        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = null, sql1 = null;
        if (!ten_san_pham.equals("") && !ten_the_loai.equals("")) {
            sql = "SELECT *"
                    + ", FROM PRODUCT, CATEGORY WHERE NAME= N'" + ten_san_pham + "' AND product.ma_the_loai = category.ma_the_loai AND ten_the_loai=N'" + ten_the_loai + "'";
            sql1 = "SELECT PRODUCT.ID_PRODUCT,PRODUCT.NAME,PRODUCT.IMAGES, PRODUCT.PRICE, PRODUCT.SUPPLIER,PRODUCT.INFORMATION, CATEGORY.ID_CATEGORY FROM PRODUCT INNER JOIN CATEGORY ON PRODUCT.ID_CATEGORY=CATEGORY.ID_CATEGORY WHERE PRODUCT.NAME='" + ten_san_pham + "' AND CATEGORY.NAME='" + ten_the_loai + "'";
        } else {
            if (ten_san_pham.equals("")) {
                sql = "SELECT * FROM PRODUCT, CATEGORY WHERE product.ma_the_loai = category.ma_the_loai AND ten_the_loai=N'" + ten_the_loai + "'";
                sql1 = "SELECT  PRODUCT.ID_PRODUCT, PRODUCT.NAME, PRODUCT.IMAGES, PRODUCT.PRICE, PRODUCT.SUPPLIER, PRODUCT.INFORMATION, PRODUCT.ID_CATEGORY "
                        + " FROM PRODUCT INNER JOIN CATEGORY ON PRODUCT.ID_CATEGORY=CATEGORY.ID_CATEGORY  WHERE CATEGORY.NAME='" + ten_the_loai + "'";
            } else {
                if (ten_the_loai.equals("")) {
                    sql = "SELECT * FROM product, category WHERE ten_san_pham= N'" + ten_san_pham + "' AND product.ma_the_loai = category.ma_the_loai";
                    sql1 = "SELECT  PRODUCT.ID_PRODUCT, PRODUCT.NAME, PRODUCT.IMAGES, PRODUCT.PRICE, PRODUCT.SUPPLIER, PRODUCT.INFORMATION, PRODUCT.ID_CATEGORY "
                            + " FROM PRODUCT INNER JOIN CATEGORY ON PRODUCT.ID_CATEGORY=CATEGORY.ID_CATEGORY  WHERE PRODUCT.NAME='" + ten_san_pham + "'";
                }
            }
        }
        List<Product> list = new ArrayList<Product>();
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ma_san_pham = rs.getInt("ID_PRODUCT");
                int ma_the_loai = rs.getInt("ID_CATEGORY");
                ten_san_pham = rs.getString("NAME");
                String hinh_anh = rs.getString("IMAGES");
                Double gia_ban = rs.getDouble("PRICE");
                String hang_san_xuat = rs.getString("SUPPLIER");
                String thong_tin = rs.getString("INFORMATION");
                list.add(new Product(ma_san_pham, ma_the_loai, ten_san_pham,
                        hinh_anh, gia_ban, hang_san_xuat, thong_tin));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public void deleteProduct(int code) {
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String deleteSQL = "DELETE PRODUCT WHERE ID_PRODUCT = ?";
        try {
            dbConnection = DBConnect.getDBConnection();
            preparedStatement = dbConnection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, code);
            // execute delete SQL stetement
            preparedStatement.executeUpdate();
            System.out.println("Record is deleted!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateProduct(Product p) {
        Connection dbConnection = null;
        PreparedStatement ps = null;
        String updateTableSQL = "UPDATE PRODUCT SET NAME = ?,SIZE = ?,COLOR= ?,COUNTRY= ?,PRICE= ?,GENDER = ?,QUANTITY_REMAINING= ?, KIND_OF_FABRIC= ?,ID_CATEGORY = ?,SUPPLIER= ?,INFORMATION =? WHERE ID_PRODUCT = ?";
        try {
            dbConnection = DBConnect.getDBConnection();
            ps = dbConnection.prepareStatement(updateTableSQL);
            ps.setInt(12, p.getID_PRODUCT());
            ps.setString(1, p.getNAME());
            ps.setString(2, p.getSize());
            ps.setString(3, p.getColor());
            ps.setString(4, p.getCountry());
            ps.setDouble(5, p.getPRICE());
            ps.setString(6, p.getGender());
            ps.setInt(7, p.getQuantity_remaining());
            ps.setString(8, p.getKindOfFabric());
            ps.setInt(9, p.getID_CATEGORY());
            ps.setString(10, p.getSUPPLIER());
            ps.setString(11, p.getINFORMATION());
            ps.executeUpdate();
            System.out.println("Record is updated to STUDENT table!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProduct(int id) {

        Connection con = null;
        try {
            con = DBConnect.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM PRODUCT WHERE ID_PRODUCT='" + id + "'";
        Product p = null;
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int ma_san_pham = rs.getInt("ID_PRODUCT");
                String ten_san_pham = rs.getString("NAME");
                String size = rs.getString("SIZE");
                String color = rs.getString("COLOR");
                String country = rs.getString("COUNTRY");
                double price = rs.getDouble("PRICE");
                int quantity_remaining = rs.getInt("QUANTITY_REMAINING");
                String gender = rs.getString("GENDER");
                int command_quantity = rs.getInt("COMMAND_QUANTITY");
                String fabric = rs.getString("KIND_OF_FABRIC");
                String image = rs.getString("IMAGES");
                int id_category = rs.getInt("ID_CATEGORY");
                String hang_san_xuat = rs.getString("SUPPLIER");
                String thong_tin = rs.getString("INFORMATION");
                p = new Product(ma_san_pham, id_category, ten_san_pham, image, price, hang_san_xuat, thong_tin, size, color, country, quantity_remaining, gender, command_quantity, fabric);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return p;
    }

    @Override
    public int genarateId(int min, int max) {
        /*random id*/
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);       
        ProductDAOImpl productDao = new ProductDAOImpl();
        /*if id exists then call genarateId() method again else break and return x*/
        for (Integer i : productDao.getId()) {
            if (i==x) {
                genarateId(min, max);
            }else{
                break;
            }
        }
        return x;
    }

    @Override
    public List<Integer> getId() {
        List<Integer> listId = null;
        try {
            listId = new ArrayList<Integer>();
            Connection con = null;

            con = DBConnect.getDBConnection();

            String sql = "SELECT ID_PRODUCT FROM PRODUCT";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listId.add(rs.getInt("ID_PRODUCT"));
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listId;
    }

    public static void main(String[] args) {
//        Product p;
//        p = new Product(8, 1, "em xinh dep", "nu4.jpg", 500.0, "", "", "", "", "", 100, "", 2, "");
//        ProductDAOImpl productDAO = new ProductDAOImpl();
////		 productDAO.addProduct(p);
////
////                System.out.println("Sucessfully!");
////        System.out.println(productDAO.getList());
////        productDAO.updateProduct(p);
////         System.out.println(productDAO.getList());
//        System.out.println(productDAO.getProduct(1));
        ProductDAOImpl productDAO = new ProductDAOImpl();
//        System.out.println(productDAO.getId());
Product p = new Product();
p.setID_PRODUCT(10);
p.setColor("red");
p.setCommand_quantity(50);
p.setCountry("amerycanVN");
p.setGender("male");
p.setID_CATEGORY(4);
p.setINFORMATION("hehe");
p.setKindOfFabric("coheo");
p.setNAME("quanzxc");
p.setPRICE(5000.0);
p.setQuantity_remaining(1241);
p.setSUPPLIER("le mizxcnh tri");
p.setSize("XXL");
p.setIMAGE("quan2.jpg");
        productDAO.addProduct(p);

    }
}
