package com.MasterAssigment;
//Create a class Course which contains cid, cname , 
//startDate(Date object) subject , fees,
//duration . For this class you can have public fields 
//as well. [NOTE: one student can be in one course only] 
public class Course {
    private int cid;
    private String cname;
    private int startDate;
    private String subject;
    private long fees;
	public Course() {
		super();
	}
	public Course(int cid, String cname, int startDate, String subject, long fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.startDate = startDate;
		this.subject = subject;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", startDate=" + startDate + ", subject=" + subject
				+ ", fees=" + fees + "]";
	}
    
    
}
