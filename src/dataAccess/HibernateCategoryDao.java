package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category is Added by using Hibernate: "+category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category is Updated by using Hibernate: "+category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category is Deleted by using Hibernate: "+category.getCategoryName());
		
	}

}
