package session3;
import java.util.Scanner;
public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	Point() {
		
	}
	static class Line extends Point {
		private Point point1;
		private Point point2;
		public Point getPoint1() {
			return point1;
		}
		public void setPoint1(Point point1) {
			this.point1 = point1;
		}
		public Point getPoint2() {
			return point2;
		}
		public void setPoint2(Point point2) {
			this.point2 = point2;
		}
		Line(Point p1,Point p2) {
			point1=p1;
			point2=p2;
		}
	}
	static class Testline {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter x coord for 1st point:");
			int x1=scan.nextInt();
			System.out.print("Enter y coord for 1st point:");
			int y1=scan.nextInt();
			System.out.print("Enter x coord for 2nd point:");
			int x2=scan.nextInt();
			System.out.print("Enter y coord for 2nd point:");
			int y2=scan.nextInt();
			Point p1=new Point(x1,y1);
			Point p2=new Point(x2,y2);
			Line l1=new Line(p1,p2);
			System.out.println("First point is("+l1.getPoint1().getX()+","+l1.getPoint1().getY()+")");
			System.out.println("Second point is("+l1.getPoint2().getX()+","+l1.getPoint2().getY()+")");
		}
	}

}
