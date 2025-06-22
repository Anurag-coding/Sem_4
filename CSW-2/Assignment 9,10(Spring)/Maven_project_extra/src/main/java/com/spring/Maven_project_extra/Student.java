package com.spring.Maven_project_extra;
public class Student {
	 private int rollNo;
	    private String name; // Changed from Name to name
	    private Address adde; // Changed from address to Address

	    public int getRollNo() {
	        return rollNo;
	    }
	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public Address getAdde() {
	        return adde;
	    }
	    public void setAdde(Address adde) {
	        this.adde = adde;
	    }
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Rollno.: "+rollNo);
	        System.out.println("Address: "+adde.toString());
	    }
	}