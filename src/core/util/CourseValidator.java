package core.util;

import java.util.List;

import entities.Course;

public class CourseValidator {

	public static void isNameValid(List<Course> courses, Course course) throws Exception{
		for(Course crs:courses) {
			if(crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Ayni isimde kurs olamaz...");
			}
		}
	}
	
	public static boolean checkPrice(Course course) {
		if(course.getPrice()<0) {
			return false;
		}
		return true;
	} 
}
