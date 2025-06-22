package com.spring.Maven_project3;
public class Bike implements Vehicle {
    private String name;
    private String id;
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getId() {
		return id;
	}
    public void setId(String id) {
		this.id = id;
	}
    public void start() {
        System.out.println("Bike " + name + " (ID: " + id + ") is starting.");
    }
    public void stop() {
        System.out.println("Bike " + name + " (ID: " + id + ") is stopping.");
    }
}