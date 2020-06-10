package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class Reports extends CommonMethods {

	@Test
	public void defineReports() {
		login.adminLogin(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

		dashboard.hoverOverReports();
		
		wait(1);
		click(eReports.add);
		
		sendText(eReports.reportName, "ElvirasReport");
		

		selectDdValue(eReports.selectionCriteria, "Employee Name");
		click(eReports.addCriteria);
		selectDdValue(eReports.include, 1);
		sendText(eReports.emplName, "test");
		
	selectDdValue(eReports.fieldGroups, 5);
//		click(eReports.addFieldGroups);
//		
//		selectDdValue(eReports.fileds, 5);
//		click(eReports.addFields);
//		
//		
//		
//		wait(1);
//		click(eReports.firstCheckBox);
//		click(eReports.secondCheckBox);
//		
//		wait(5);
//		click(eReports.save);
		
	}

}
