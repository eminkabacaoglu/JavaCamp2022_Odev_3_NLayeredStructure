package core.util;

import java.util.List;

import entities.Category;

public class CategoryValidator {
	
	public static void isNameValid(List<Category> categories, Category category) throws Exception{
		for(Category ctgry:categories) {
			if(ctgry.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Ayni isimde kategori olamaz...");
			}
		}
	}
}
