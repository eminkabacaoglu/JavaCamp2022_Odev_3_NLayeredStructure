package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Category is Added by using Hibernate: "+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Category is Deleted by using Hibernate: "+course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Category is Updated by using Hibernate: "+course.getCourseName());
		
	}

}
