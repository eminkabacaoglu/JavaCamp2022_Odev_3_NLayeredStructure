import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers  = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Instructor instructor1 = new Instructor(1, "Emin", "Kabacaoglu");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		
		Category category1 = new Category("Backend Development");
		List<Category> categories = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categories, loggers);
		categoryManager.add(category1);
		
		Category category2 = new Category("FrontEnd Development");
		categoryManager.add(category2);
		
		Course course = new Course(1, "Java Development", category1, instructor1,250);
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
		courseManager.add(course);
		

	}

}
