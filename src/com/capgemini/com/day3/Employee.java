package com.capgemini.com.day3;

public class Employee {
	String employeeId;
	String employeeName;
    double hra;
    double pf;
    double basicSalary;
    double grossSalary;
    double medical;
    public static double PT=200;
     double netSalary;
      public Employee(String employeeId, String employeeName,double medical,double basicSalary )
      {
    	  this.employeeId=employeeId;
    	  this.employeeName=employeeName;
    	  this.medical=medical;
    	  this.basicSalary=basicSalary;
    	  
      }
       public void calculateNetSalary()
       {
		hra=0.5*basicSalary;
		pf=0.12*basicSalary;
		grossSalary=hra+basicSalary+medical;
		netSalary=grossSalary-(pf+PT); 
       }
       public String displayEmployeeInformation()
       {
		calculateNetSalary();
    	   return ("id is " +employeeId +" Name is " +employeeName +" Net Salary is " +netSalary) ;
       }
  
	
	

}
