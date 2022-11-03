package kodlamaIoHomework.dataAccess;


import kodlamaIoHomework.entities.Course;

public interface CourseRepository {

	public void add(Course course);
	public void delete(Course course);
	public void update(Course course);
	public boolean check(String courseName);
}
