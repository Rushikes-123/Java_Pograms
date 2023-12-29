package com.MasterAssigment;
//Create following Bean structures. Sorting always for 
//each bean on the primary key:
//Create class Student (sid , sname , cid, phno , email) 
//All fields should be private. Write
//appropriate getter and setter methods to access them.

public class Student {

	private int sid;
	private String sname;
	private int cid;
	private long phonenumber;
	private String email;
	public Student() {
		super();
	}
	
	
	public Student(int sid, String sname, int cid, long phonenumber,String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cid = cid;
		this.phonenumber = phonenumber;
		this.email=email;
	}


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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getemail() {
		return email;
		
	}
	public void setemail() {
		this.email=email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cid=" + cid + ", phonenumber=" + phonenumber + "email"+email+"]";
	}
	
	
}
