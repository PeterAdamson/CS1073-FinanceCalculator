//*@authors Kyle Sutherland and Peter Adamson */

import java.util.Scanner;

public class UserInterface {

	private Scanner sc = new Scanner(System.in);

	public double promptForPV(){
		System.out.println("What principle value do you want to invest?");
		double userInput = sc.nextDouble();
		return userInput;
	}

	public int promptForY(){
		System.out.println("How many years do you want to invest it?");
		int userInput2 = sc.nextInt();
		return userInput2;
	}
}
