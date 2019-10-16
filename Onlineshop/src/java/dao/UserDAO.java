package dao;

import dao.*;
import java.util.List;
import model.Customer;


public interface UserDAO {
	
	public void addUser(Customer u);
	
	public boolean checkUser(String username);
	
	public boolean login(String username, String password);
        
        public Customer Userlogin(String username, String password);
	
	public void updateUser(Customer u);
	
	public Customer getUser(int userid);
        public Customer getUser(String username);
        
        public int getLastIndextID();
                
        public int genarateId(int min, int max);
        
        public List<Integer> getId();

        public List<Customer> getListCustomer();
}
