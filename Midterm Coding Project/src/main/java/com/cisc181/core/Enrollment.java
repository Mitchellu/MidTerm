package com.cisc181.core;
import java.util.UUID;
import java.util.Date;
import com.cisc181.eNums.eMajor;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public UUID getSectionID(){
		return SectionID;
		
	}
	public void setSectionID(UUID SectionID){
		this.SectionID=SectionID;
		
	}
	public UUID getStudentID(){
		return StudentID;
		
	}
	public void setStudentID(UUID StudentID){
		this.StudentID=StudentID;
		
	}
	private Enrollment(){
		
	}
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID=StudentID;
		this.SectionID=SectionID;
		
	}
	public UUID getEnrollmentID(){
		return EnrollmentID;
		
	}
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID=EnrollmentID;
		
	}
	public double getGrade(){
		return Grade;
		
	}
	public void setGrade(double Grade){
		this.Grade=Grade;
		
	}

}
