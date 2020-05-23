package com.stackroute.spring.ioc.annotation.beans;

import org.springframework.stereotype.Component;

@Component
public class Hobby {
	
	private int id;
	private String name;
	private int since;
	
	
	public Hobby() {
	System.out.println("Hobby() Constructor...");
	}
	
	
	public Hobby(int id, String name, int since) {
		System.out.println("Hobby(int,String,int) Constructor..");
		this.id = id;
		this.name = name;
		this.since = since;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", name=" + name + ", since=" + since + "]";
	}
	
	
	
	

}
