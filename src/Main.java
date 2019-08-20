//Paramjeet Kaur  StudentId:C0747429
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 3) {
			// 1. show the menu
			showMenu();
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			// 3. DEBUG: Output what the user typed in 
			System.out.println("You entered: " + choice);
			System.out.println();
			if(choice==1)
			{
				System.out.println("Enter the base of triangle");
				int base1=keyboard.nextInt();
				System.out.println("Enter the height of triangle");
				int height=keyboard.nextInt();
				Double Area=0.5*base1*height;
				System.out.println("Area of triangle is "+Area);
				
			}
			if(choice==2)
			{
				System.out.println("Enter the side of square");
				Double side=keyboard.nextDouble();
				Double Area=side*side;
				System.out.println("Area of square is "+Area);
				
			}
			
			if(choice==3)
			{
				System.out.println("you exit the system");
				
			}
	
		}
	}
	 
	    
	 
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

}

