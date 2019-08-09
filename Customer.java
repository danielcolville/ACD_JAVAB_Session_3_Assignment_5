package session3;
import java.util.Scanner;
public class Customer {
	private int custNo;
	private String custName;
	private static int custCount;
	static {
		custCount=0;
	}
	Customer(int custNo, String custName) {
		custCount++;
		this.custNo=custNo;
		this.custName=custName;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public  static int getCustCount() {
		return custCount;
	}
	
	static class CountCustomer{
		public static void main(String[] args) {
			System.out.println("Initial customer count is "+custCount);
			Scanner scan=new Scanner(System.in);
			Customer[] custList=new Customer[3];
			for(int i=0;i<3;i++) {
				System.out.print("Enter customer name:");
				String cname=scan.next();
				System.out.print("Enter customer number:");
				int cnum=scan.nextInt();
				custList[i]=new Customer(cnum,cname);
				System.out.println("Current customer count is "+custCount);
			}
			scan.close();
		}
	}

}

