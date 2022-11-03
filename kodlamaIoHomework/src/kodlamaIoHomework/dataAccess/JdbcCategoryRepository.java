package kodlamaIoHomework.dataAccess;

import java.util.ArrayList;


import kodlamaIoHomework.entities.Category;

public class JdbcCategoryRepository implements CategoryRepository{

	ArrayList<Category> categories = new ArrayList<Category>();
	public void add(Category category) {
		
		
	}

	public void delete(Category category) {
		
		
	}

	public void update(Category category) {
		
		
	}

	public boolean check(String categoryName) {
		for (Category category : categories) {
			if(category.getCategoryName().equalsIgnoreCase(categoryName)) {
				return true;
				
			}
			
		}
		return false;
	}

}
