package dao;

import dao.*;
import java.util.List;
import model.Category;



public interface CategoryDAO {

	// thêm danh mục mới
	public void addCategory(Category c);

	public void delCategory(int ma_the_loai);

	// danh sach
	public List<Category> getList();

	public Category getCategory(int  id);
        public Category getCategoryName(String  name);
	
	public void updateCategory(Category c);

}
