package dao;


import dao.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



import model.Customer;


public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(Customer u) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, u.getID_CUSTOMER());
			ps.setString(2, u.getNAME());
			ps.setDate(3, u.getDATEOFBIRTH());
			ps.setString(4, u.getPHONE());
			ps.setString(5, u.getEMAIL());
			ps.setString(6, u.getPASSWORD());
                        ps.setString(7, u.getADDRESS());
                        ps.setString(8, u.getGENDER());
                        ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkUser(String username) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM CUSTOMER WHERE NAME='" + username + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) throws ParseException {
		UserDAOImpl dao = new UserDAOImpl();
                java.sql.Date ngaysinh=null;
                ngaysinh = new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-24")).getTime());
//               Customer c=new Customer(3, "user02", ngaysinh, "0334517234", "user02@gmail.com", "user02", "da nang", "male");
//                dao.updateUser(c);
//                System.out.println(dao.getUser("user02"));
//                System.out.println("successfully!");
            
            System.out.println(dao.Userlogin("hoa", "hoa"));
        }

	@Override
	public boolean login(String username, String password) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM CUSTOMER WHERE NAME='" + username
				+ "' AND PASS='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateUser(Customer u) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "UPDATE CUSTOMER SET NAME=?, PASS=?, DATEOFBIRTH=?, GENDER=?, EMAIL=?, TEL=?, CUSTOMER_ADDRESS=? WHERE ID_CUSTOMER=?";
		try {
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement(sql);
			ps.setString(1, u.getNAME());
			ps.setString(2, u.getPASSWORD());
			ps.setDate(3, u.getDATEOFBIRTH());
			ps.setString(4, u.getGENDER());
			ps.setString(5, u.getEMAIL());
			ps.setString(6, u.getPHONE());
			ps.setString(7, u.getADDRESS());
			ps.setInt(8, u.getID_CUSTOMER());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Customer getUser(String name) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM CUSTOMER WHERE NAME='" + name + "'";
		Customer u = new Customer();
		try {
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int user_id= rs.getInt("ID_CUSTOMER");
				String username = rs.getString("NAME");
				String sdt = rs.getString("TEL");
				String email = rs.getString("EMAIL");
                                String password = rs.getString("PASS");
                                String diachi = rs.getString("CUSTOMER_ADDRESS");
                                String gioitinh = rs.getString("GENDER");
				
				
				
				u = new Customer(user_id, username, null, sdt, email, password, diachi, gioitinh);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

    @Override
    public Customer Userlogin(String username, String password) {
        Customer c = null;
        Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM CUSTOMER WHERE NAME='" + username
				+ "' AND PASS='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int user_id= rs.getInt("ID_CUSTOMER");
				String userN = rs.getString("NAME");
				String sdt = rs.getString("TEL");
				String email = rs.getString("EMAIL");
                                String pw = rs.getString("PASS");
                                String diachi = rs.getString("CUSTOMER_ADDRESS");
                                String gioitinh = rs.getString("GENDER");
                                c = new Customer();
                                c.setID_CUSTOMER(user_id);
                                c.setNAME(userN);
                                c.setPASSWORD(pw);
                                c.setADDRESS(diachi);
                                c.setPHONE(sdt);
                                c.setEMAIL(email);
                                c.setGENDER(gioitinh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
                return c;
    }

    @Override
    public int getLastIndextID() {

       return 0;
    }

    @Override
    public int genarateId(int min, int max) {
           /*random id*/
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);       
        UserDAOImpl productDao = new UserDAOImpl();
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

            String sql = "SELECT ID_CUSTOMER FROM CUSTOMER";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listId.add(rs.getInt("ID_CUSTOMER"));
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
    public List<Customer> getListCustomer() {
        List<Customer> listCustomer = null;
        try {
            listCustomer = new ArrayList<Customer>();
            Connection con = null;

            con = DBConnect.getDBConnection();

            String sql = "SELECT * FROM CUSTOMER";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                int user_id= rs.getInt("ID_CUSTOMER");
		String userN = rs.getString("NAME");
		String sdt = rs.getString("TEL");
		String email = rs.getString("EMAIL");
                String pw = rs.getString("PASS");
                String diachi = rs.getString("CUSTOMER_ADDRESS");
                String gioitinh = rs.getString("GENDER");
                c.setID_CUSTOMER(user_id);
                c.setNAME(userN);
                c.setPASSWORD(pw);
                c.setADDRESS(diachi);
                c.setPHONE(sdt);
                c.setEMAIL(email);
                c.setGENDER(gioitinh);
                listCustomer.add(c);
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCustomer;
    }
    
    


}
