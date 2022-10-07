package entities;

public class Course {
	
	private int courseId;
	private String CourseName;
	private Category category;
	private Instructor instructor;
	private double price;
	public Course(int courseId, String courseName, Category category, Instructor instructor, double price) {
		this.courseId = courseId;
		CourseName = courseName;
		this.category = category;
		this.instructor = instructor;
		this.price = price;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
