package project;

import java.util.Scanner;

public class Game {

	
	Game(){
		System.out.println("Welcome to Game :");
		System.out.println("Game is now Started :");
	}
	public int selectShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("========Press 1 for 2-D Shape==================");
		System.out.println("========Press 2 for 3-D Shape==================");
		int x = sc.nextInt();
		
//		sc.close();
		
		if(x==1) {
			System.out.println("You have selected 2-D Shape :");
			return x;
		}
		
		else if(x==2) {
			System.out.println("You have selected 3-D Shape :");
			
			return x;
		}
		else {
			System.out.println("This is not a valid choice :");
			System.out.println("Please select from right Options :");
			return selectShape();
		}
		
	}
	
	public TwoDShape selectTwoDShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===Press 1 for Circle : ");
		System.out.println("===Press 2 for Triangle : ");
		System.out.println("===Press 3 for Rectangle : ");
		System.out.println("===Press 4 for Rectangle : ");
		System.out.println("===Press 5 for Square : ");
		int choice = sc.nextInt();
		
//		sc.close();
		switch(choice) 
		{
		case 1:
			System.out.println("You have selected Circle :");
			System.out.println("Enter the Radius");
			double r = sc.nextDouble();
//			Circle c1= new Circle(r);
			return new Circle(r);
			
		case 2:
			
			
			
		case 3:
			System.out.println("You have selected Rectangle!");
			System.out.println("Enter the length :");
			double l = sc.nextDouble();
			System.out.println("Enter the width :");
			double w = sc.nextDouble();
			
			
			return new Rectangle(l, w);
			
			
		case 4:
			
			
			
		case 5:
			System.out.println("You have selected Square!");
			System.out.println("Enter the side :");
			double side = sc.nextDouble();
			
			
			return new Square(side);
			
			
			default:
				System.out.println("This is not the Right Choice :");
				System.out.println("Please choice the right ");
				
				return selectTwoDShape();
		}
		
		
		
		
	}
	
}
