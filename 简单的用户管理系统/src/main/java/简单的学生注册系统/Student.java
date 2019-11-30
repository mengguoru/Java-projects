package 简单的学生注册系统;

public class Student {
	public Student(int studentId, String name, String majorAndClass, String phoneNum) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.majorAndClass = majorAndClass;
		this.phoneNum = phoneNum;
	}
	private int studentId;
	private String name;
	private String majorAndClass;
	private String phoneNum;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajorAndClass() {
		return majorAndClass;
	}
	public void setMajorAndClass(String majorAndClass) {
		this.majorAndClass = majorAndClass;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
