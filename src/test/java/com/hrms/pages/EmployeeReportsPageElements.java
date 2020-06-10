package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class EmployeeReportsPageElements extends CommonMethods{

@FindBy (xpath="//input[@id='btnAdd']")	
	public WebElement add;
	
	
	@FindBy(id="report_report_name")
	public WebElement reportName;
	
	@FindBy (id="report_criteria_list")
	public WebElement selectionCriteria;
	
	@FindBy (id="btnAddConstraint")
	public WebElement addCriteria;
	
	
	
	
	@FindBy(id="report_include_comparision")
	public WebElement include;
	
	@FindBy (id="report_display_groups")
	public WebElement fieldGroups;
	
	@FindBy (id="btnAddDisplayGroup")
	public WebElement addFieldGroups;
	
	

	@FindBy(id="report_display_field_list")
	public WebElement fileds;
	
	@FindBy (id="btnAddDisplayField")
	public WebElement addFields;
	
	@FindBy (id="btnSave")
	public WebElement save;
	
	@FindBy(id="employee_name_empName")
	public WebElement emplName;
	
	
	@FindBy(id="display_group_1")
	public WebElement firstCheckBox;
	
	@FindBy(id="display_group_2")
	public WebElement secondCheckBox;
	
	
	public EmployeeReportsPageElements() {
	PageFactory.initElements(driver, this);
}
	
	
	
}
