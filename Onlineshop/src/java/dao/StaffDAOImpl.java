/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Staff;

/**
 *
 * @author FSC
 */
public class StaffDAOImpl implements StaffDAO{
    public boolean checkStaff(String staffname) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StaffDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM STAFF WHERE NAME='" + staffname + "'";
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
    public boolean login(String staffname, String password) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StaffDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM STAFF WHERE NAME='" + staffname
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
    public Staff getStaff(String name) {
		Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM STAFF WHERE NAME='" + name + "'";
		Staff s = new Staff();
		try {
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int staff_id= rs.getInt("ID_STAFF");
				String username = rs.getString("NAME");
				String sdt = rs.getString("TEL");
				String email = rs.getString("EMAIL");
                                String password = rs.getString("PASS");
                                String diachi = rs.getString("STAFF_ADDRESS");
			
				s = new Staff(staff_id, username, sdt, email, password, diachi);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}

    @Override
    public Staff Stafflogin(String staffname, String password) {
        Staff staff = null;
        Connection con=null;
            try {
                con = DBConnect.getDBConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StaffDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
		String sql = "SELECT * FROM STAFF WHERE NAME='" + staffname
				+ "' AND PASS='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int staff_id= rs.getInt("ID_STAFF");
				String username = rs.getString("NAME");
				String sdt = rs.getString("TEL");
				String email = rs.getString("EMAIL");
                                String pw = rs.getString("PASS");
                                String diachi = rs.getString("STAFF_ADDRESS");
                                staff = new Staff(staff_id,username,sdt,email,pw,diachi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staff;
    }
}
