package kodlamaIoHomework.dataAccess;

import java.util.ArrayList;

import kodlamaIoHomework.entities.Course;

public class JdbcCourseRepository implements CourseRepository{

	ArrayList<Course> courses = new ArrayList<Course>();
	public void add(Course course) {
		
		
	}

	public void delete(Course course) {
		
		
	}

	public void update(Course course) {
		
		
	}

	public boolean check(String courseName) {
		for (Course course : courses) {
			if(course.getCourseName().equalsIgnoreCase(courseName)){
				return true;
			}
			
		}
		return false;
	}

	

}
