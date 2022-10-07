package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course is Added by using JDBC: "+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course is Deleted by using JDBC: "+course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course is Updated by using JDBC: "+course.getCourseName());
		
	}

}
