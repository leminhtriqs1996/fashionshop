/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Staff;

/**
 *
 * @author FSC
 */
public interface StaffDAO {
	
	public boolean checkStaff(String username);
	
	public boolean login(String staffname, String password);
        
        public Staff Stafflogin(String staffname, String password);
	
	public Staff getStaff(String name);

}
