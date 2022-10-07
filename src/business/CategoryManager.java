package business;

import java.util.List;

import core.logging.Logger;
import core.util.CategoryValidator;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Category> categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		try {
			CategoryValidator.isNameValid(categories, category);
			this.categoryDao.add(category);
			this.categories.add(category);
			
			for(Logger logger:loggers) {
				logger.log(category.getCategoryName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update(Category category) {
		
		categoryDao.update(category);
		
	}

	public void delete(Category category) {
	
	categoryDao.delete(category);
	
	}

}
