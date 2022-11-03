package kodlamaIoHomework.dataAccess;

import kodlamaIoHomework.entities.Category;

public interface CategoryRepository {
	
	public void add(Category category);
	public void delete(Category category);
	public void update(Category category);
	public boolean check(String categoryName);

}
