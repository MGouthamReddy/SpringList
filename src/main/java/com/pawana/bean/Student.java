package com.pawana.bean;

import java.util.List;

public class Student {
	private int sid;
	private String sname;
	private List<Integer>markers;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Integer> getMarkers() {
		return markers;
	}
	public void setMarkers(List<Integer> markers) {
		this.markers = markers;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", markers=" + markers + "]";
	}

}
