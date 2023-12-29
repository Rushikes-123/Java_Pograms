package com.MasterAssigment;
//Create Attendance class with fields of your choice where you have to track attendance 
//of each student every day.
public class Transaction {
	    private long studentId;
	    private long courseId;
	    private double amountPaid;

	    public Transaction(long studentId, long courseId, double amountPaid) {
	        this.studentId = studentId;
	        this.courseId = courseId;
	        this.amountPaid = amountPaid;
	    }

	    public long getStudentId() {
	        return studentId;
	    }

	    public long getCourseId() {
	        return courseId;
	    }

	    public double getAmountPaid() {
	        return amountPaid;
	    
	}

}
