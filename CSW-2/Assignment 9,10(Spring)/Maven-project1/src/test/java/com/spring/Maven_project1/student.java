package com.spring.Maven_project1;
public class student {
	private String name;
	private int rollno;
	private String emailid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Emailid: "+emailid);
	}
}