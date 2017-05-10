package com.example.kiran.business;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Business {


	@Id
	private String id;
	private String businessname;
	private String businesstype;
	
	public Business() {
	}
	
	public Business(String id, String businessname, String businesstype) {
		this.id = id;
		this.businessname = businessname;
		this.businesstype = businesstype;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBusinessname() {
		return businessname;
	}
	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}
	public String getBusinesstype() {
		return businesstype;
	}
	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}



}