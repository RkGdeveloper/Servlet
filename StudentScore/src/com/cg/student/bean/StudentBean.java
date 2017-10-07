package com.cg.student.bean;

public class StudentBean {

	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName="
				+ studentName + ", age=" + age + ", state=" + state
				+ ", gender=" + gender + ", centum=" + centum + ", attempts="
				+ attempts + ", totalSub=" + totalSub + "]<br/>";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String studentId;
	private String studentName;
	private String age;
	private String state;
	private String gender;
	private String centum;
	private String attempts;
	private String totalSub;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public StudentBean(String studentId, String studentName, String age,
			String state, String gender, String centum, String attempts,
			String totalSub) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.state = state;
		this.gender = gender;
		this.centum = centum;
		this.attempts = attempts;
		this.totalSub = totalSub;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCentum() {
		return centum;
	}
	public void setCentum(String centum) {
		this.centum = centum;
	}
	public String getAttempts() {
		return attempts;
	}
	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}
	public String getTotalSub() {
		return totalSub;
	}
	public void setTotalSub(String totalSub) {
		this.totalSub = totalSub;
	}

	public StudentBean()
	{
		
	}
	
}
