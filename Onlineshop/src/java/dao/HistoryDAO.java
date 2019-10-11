package dao;

import dao.*;
import java.util.List;

import model.History;
import model.Command;

public interface HistoryDAO {

    //thêm mới một lịch sử mua hàng.
    public void addHistory(Command c);

    //add into order table 

    public void addOrder(Command c);

    //lọc lịch sử của khách hàng.
    public List<Command> getList(int user_id);

    public List<Integer> getId();

    public int genarateId(int min, int max);
    //get Index checker in commad table
    public List<Boolean> getIndexCheck();
    
    public void updateCommandTable(Command c);
    
    public List<Command> getListCommand();

}
