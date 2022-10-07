package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor is Added by using JDBC: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor is Updated by using JDBC: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor is Deleted by using JDBC: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
