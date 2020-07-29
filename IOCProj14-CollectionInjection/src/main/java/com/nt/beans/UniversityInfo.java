package com.nt.beans;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
private Map<Integer,String> facultyDetails;
private Map<String,Date> dateinfo;
private Properties fruitsinfo;

public void setFruitsinfo(Properties fruitsinfo) {
	this.fruitsinfo = fruitsinfo;
}
public void setFacultyDetails(Map<Integer, String> facultyDetails) {
	this.facultyDetails = facultyDetails;
}
public void setDateinfo(Map<String, Date> dateinfo) {
	System.out.println(dateinfo.getClass());
	this.dateinfo = dateinfo;
}
@Override
public String toString() {
	return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateinfo=" + dateinfo + ", fruitsinfo=" + fruitsinfo
			+ "]";
}




}
