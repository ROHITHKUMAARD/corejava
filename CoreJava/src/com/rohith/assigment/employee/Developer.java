package com.rohith.assigment.employee;

public class Developer  extends employee{
	private String proglang;
	
	// Constructor
	public Developer(String name, int empid, int salary, String proglang) {
		super(name,empid,salary);
		this.proglang = proglang;
	}

	public String getProglang() {
		return proglang;
	}

	public void setProglang(String proglang) {
		this.proglang = proglang;
	}
}