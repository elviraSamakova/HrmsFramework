package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.CandidatesPageElement;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeReportsPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;    //public static String name;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static CandidatesPageElement candidates;
	public static EmployeeReportsPageElements eReports; 
	
	
	public static void initialize() {
		
		login=new LoginPageElements();    //name="Elvira";
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		candidates= new CandidatesPageElement();
		eReports= new EmployeeReportsPageElements();
	}
}

