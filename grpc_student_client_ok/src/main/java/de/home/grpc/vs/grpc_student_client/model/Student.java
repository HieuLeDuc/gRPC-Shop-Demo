package de.home.grpc.vs.grpc_student_client.model;

public class Student {
	private String id;
	private String firstName;
	private String familiyName;
	private String course;
	
	
	public Student(String id, String firstName, String familiyName, String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.familiyName = familiyName;
		this.course = course;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamiliyName() {
		return familiyName;
	}
	public void setFamiliyName(String familiyName) {
		this.familiyName = familiyName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
