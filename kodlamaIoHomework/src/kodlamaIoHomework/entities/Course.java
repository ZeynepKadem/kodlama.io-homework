package kodlamaIoHomework.entities;

public class Course {
	private int id;
	private double price;
	private String courseName;
	private String description;
	
	public Course() {
		
	}
	public Course(int id, double price, String courseName, String description) {
		
		this.id = id;
		this.price = price;
		this.courseName = courseName;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
