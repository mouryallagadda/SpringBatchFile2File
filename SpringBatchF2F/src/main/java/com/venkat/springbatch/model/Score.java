package com.venkat.springbatch.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.LocalDate;

@XmlRootElement(name = "Score")
public class Score {

	private String studentName;
	
	private LocalDate dob;
	
	private double percentage;

	@XmlElement(name = "studentName")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@XmlElement(name = "dob")
	@XmlJavaTypeAdapter(type = LocalDate.class, value = com.venkat.springbatch.LocalDateAdapter.class)
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@XmlElement(name = "percentage")
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Score [studentName=" + studentName + ", dob=" + dob + ", percentage=" + percentage + "]";
	}
	
	
}
