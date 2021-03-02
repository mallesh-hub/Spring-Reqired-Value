package com.java.loadingpropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${Student.name}")
	private String name;
	
	//@Required
	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${Student.hobby}")
	private String hobby;
	
	
	/*
	 * public String getName() { return name; }
	 * 
	 * //@Value("${Student.name}") public void setName(String name) { this.name =
	 * name; System.out.println("using the  set name metod"); } public String
	 * getIntrestedCourse() { return intrestedCourse; } //@Required
	 * //@Value("${Student.intrestedCourse}") public void setIntrestedCourse(String
	 * intrestedCourse) { this.intrestedCourse = intrestedCourse;
	 * System.out.println("usung set course method"); } public String getHobby() {
	 * return hobby; } //@Required //@Value("${Student.hobby}") public void
	 * setHobby(String hobby) { this.hobby = hobby; System.out.println();
	 * System.out.println("using set hoby method"); }
	 */
	public void displayStudentInfo()
	{
		System.out.println("name is:  "+name);
		System.out.println("Intrested course :"+intrestedCourse);
		System.out.println("hobbies are :"+hobby);
	}
	
	
}
