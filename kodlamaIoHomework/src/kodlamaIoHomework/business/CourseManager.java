package kodlamaIoHomework.business;

import java.util.List;

import kodlamaIoHomework.dataAccess.CourseRepository;
import kodlamaIoHomework.entities.Course;
import kodlamaIoHomework.loging.Logger;

public class CourseManager {
	private CourseRepository courseRepository;
	private List<Logger> loggers;
	
	
	public CourseManager() {
		
	}

	public CourseManager(CourseRepository courseRepository, List<Logger> loggers) {
		
		this.courseRepository = courseRepository;
		this.loggers = loggers;
	}
	
	public void add(Course course)throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("kursun fiyatý 0 dan küçük olamaz.");
		}
		
		if (courseRepository.check(course.getCourseName())) {
			throw new Exception("kurs adý ayný olamaz");
		}
		courseRepository.add(course);
		 for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
			
		
	}

}
