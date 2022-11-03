package kodlamaIoHomework.business;

import java.util.List;

import kodlamaIoHomework.dataAccess.CategoryRepository;
import kodlamaIoHomework.entities.Category;
import kodlamaIoHomework.loging.Logger;

public class CategoryManager {
	private CategoryRepository categoryRepository;
	private List<Logger> loggers;
	
	
	
	public void add(Category category) throws Exception {
		
		if(categoryRepository.check(category.getCategoryName())) {
			throw new Exception("kategori ismi ayný olamaz");
			
		}
	    categoryRepository.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
			
		}
	
	
	
	
	public CategoryManager() {
		
	}


	public CategoryManager(CategoryRepository categoryRepository, List<Logger> loggers) {
		
		this.categoryRepository = categoryRepository;
		this.loggers = loggers;
	
	}
	
	

}
