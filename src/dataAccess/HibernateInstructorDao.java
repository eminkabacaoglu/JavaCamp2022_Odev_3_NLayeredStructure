package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Category is Added by using Hibernate: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Category is Updated by using Hibernate: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Category is Deleted by using Hibernate: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
