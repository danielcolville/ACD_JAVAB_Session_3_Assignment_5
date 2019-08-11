package session3;

public class HRMS {
	class Complaints {
		private String employeeFiling;
		private String complaintReason;
		private String complaintAbout;
	}
	class Person {
		private int age;
		private String address;
		private String phoneNumber;
		private String email;
	}
	class Candidates extends Person {
		private int expectedSalary;
		private String[] mainSkills;
		private String[] interviewComments;
	}
	class Employee extends Person {
		private String manager;
		private int salary;
		private String department;
		private String employeeID;
	}
	class Manager extends Employee {
		private String[] employeesSupervised;
		
	}
	class Payroll {
		private String payPeriod;
		private double paymentDue;
		private String payMethod;
		private String accountNumber;
		private String employeeID;
	}
	
}
