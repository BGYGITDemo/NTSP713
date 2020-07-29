package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class MarksInfo {
	private int marks[];
	private Date dob[];

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setDate(Date[] dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + ", date=" + Arrays.toString(dob) + "]";
	}


	

	

}
