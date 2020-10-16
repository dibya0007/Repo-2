package com.lti.model;

public class product {
	int pid;
	String pname;
	String pdescription;
	double price;
	public double getPrice(){
		return price;
	}
	public int getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription =pdescription;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
