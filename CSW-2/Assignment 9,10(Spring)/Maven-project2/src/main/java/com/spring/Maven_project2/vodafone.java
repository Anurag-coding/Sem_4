package com.spring.Maven_project2;
public class vodafone implements Sim{
	@Override
	public void calling() {
		System.out.println("Calling from airtel.");
	}
	@Override
	public void data() {
		System.out.println("Data available:100mb!!");
	}
}