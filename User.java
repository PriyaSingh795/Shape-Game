package project;
import java.util.Scanner;
public class User {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char c;
//		sc.close();
		do {
		int choice = g.selectShape();
		System.out.println("Choice is "+choice);
		
		switch(choice)
		{
		case 1:
			TwoDShape t1 = g.selectTwoDShape();
			t1.getArea();
			t1.getParimeter();
			break;
		case 2:
//			ThreeDShape t2 = g.selectThreeDShape();
			
			 
			
		}
		System.out.println("Press Y/y to continue or other character to exit!!");
		c=sc.next().charAt(0);
		}while(c=='Y'|| c=='y');
		System.out.println("Thank you for playing");
	}

}
