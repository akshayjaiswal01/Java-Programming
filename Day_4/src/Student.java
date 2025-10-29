import java.util.Date;

public class Student 
{
	private int stdID;
	private String stdName;
	private float marks1;
	private float marks2;
	private Date bdate;
	
	public Student() {
		stdID = 0;
		stdName = null;
		marks1 = 0.0f;
		marks2 = 0.0f;
		bdate = null;
	}
	

	public Student(int stdID, String stdName, float marks1, float marks2, Date bdate) {
		
		this.stdID = stdID;
		this.stdName = stdName;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.bdate = bdate;
	}
	
	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String toString() {
		return "stdID=" + stdID + ", stdName=" + stdName + ", marks1=" + marks1 + ", marks2=" + marks2
				+ ", bdate=" + bdate;
	}
	
	
	
}
