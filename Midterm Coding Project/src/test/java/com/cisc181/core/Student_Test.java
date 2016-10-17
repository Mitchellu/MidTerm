package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	public static ArrayList<Course> Course=new ArrayList<Course>(5);
	public static ArrayList<Semester> Semester=new ArrayList<Semester>(5);
	public static ArrayList<Section> Section=new ArrayList<Section>(5);
	public static ArrayList<Student> Student=new ArrayList<Student>(5);

	@BeforeClass
	public static void setup() throws Exception{
	}

	@Test
	public void test() throws Exception{
		assertEquals(1, 1);
	}
	public static void GPA() throws PersonException{
		assertEquals(1,1);
	}
	public static void AverageGrade() throws PersonException{
		assertEquals(1,1);
	}

}