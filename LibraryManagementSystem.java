package session3;

public class LibraryManagementSystem {
	class Content {
		private int numCopies;
		private int numCheckeOut;
		private String title;
	}
	class Book extends Content {
		private String genre;
		private int numPages;
	}
	class Magazine extends Content {
		private String publishFrequency;
		private int maxIssuesKept;
		
	}
	class Digital extends Content {
		private String idNumber;
		
	}
	class Person{
		private int age;
		private String address;
		private String phoneNumber;
		private String emailAdr;
	}
	class Employee extends Person {
		private String specialization;
		private int salary;
	}
	class CardHolder extends Person {
		private int numberCheckedOut;
		private String[] checkedOutTitles;
		private double finesOwed;
		private int numberLate;
	}
}
