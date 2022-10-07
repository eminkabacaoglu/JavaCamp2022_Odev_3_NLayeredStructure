package business;

import java.util.List;

import core.logging.Logger;
import core.util.CourseValidator;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
		
	}
	
	
	public void add(Course course) {
		try {
			CourseValidator.isNameValid(courses, course);
			this.courseDao.add(course);
			this.courses.add(course);
			
			for(Logger logger:loggers) {
				logger.log(course.getCourseName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void update(Course course) {
		this.courseDao.update(course);
	}
	public void delete(Course course) {
		this.courseDao.delete(course);
	}
}
