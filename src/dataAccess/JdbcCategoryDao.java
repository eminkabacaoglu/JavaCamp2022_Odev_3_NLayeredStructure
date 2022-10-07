package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category is Added by using JDBC: "+category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category is Updated by using JDBC: "+category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category is Deleted by using JDBC: "+category.getCategoryName());
		
	}

}
