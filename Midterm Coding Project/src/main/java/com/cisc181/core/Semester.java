package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public UUID getSemesterID(){
		return SemesterID;
		
	}
	public void setSemesterID(UUID SemesterID){
		this.SemesterID=SemesterID;
		
	}
	public Date getStartDate(){
		return StartDate;
		
	}
	public void setStartDate(Date StartDate){
		this.StartDate=StartDate;
		
	}
	public Date getEndDate(){
		return EndDate;
		
	}
	public void setEndDate(Date EndDate){
		this.EndDate=EndDate;
		
	}

}
