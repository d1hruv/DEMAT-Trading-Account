package Main;
import java.util.List;
import java.util.Scanner;

import DataStructures.MonoValueHashMap;
import Entities.UserData;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class DematClass {
	// Main menu.
	public static void mainSelection(){
	
	System.out.println("DEMAT Trading Account Manager");
	System.out.println("=============================");
	System.out.println("1 - Create Account.");
	System.out.println("2 - Login.");
	System.out.println("3 - Quit.");
	System.out.println("=============================");
	System.out.print("Please enter your choice from 1 to 3 :");
	
	// Setup Scanner.
	Scanner input = new Scanner(System.in);
	
	// Get choice from user
	int choice = input.nextInt();
	
	// Check choice value
	switch(choice)
	{
	case 1:
		System.out.println("To create an account please enter below details :");
		// Setup Scanner Create Account input
		System.out.print("Enter Username : ");
		String userName = input.nextLine();
		int accountNumber = (int) (Math.random()*1000);
		UserData user = new UserData(userName, accountNumber,10000.00);
		MonoValueHashMap mono = new MonoValueHashMap("UserData");
		mono.MonoValueUpdateHashMap(user);
		System.out.println("Your account has been created successfully.");
		System.out.println("Your account number is "+accountNumber+" and default balance is 10,000 INR.");
		System.out.println("Thank You!");
		mainSelection();
		
	/*	String password;
		String passwordMatch;*/
		// Checks for password match
		
	case 2:
		int inputAccountnumber;
		//String inputPassword;
	
		System.out.print("Please enter your account number : ");
		inputAccountnumber = input.nextInt();
		//System.out.println("Enter Password : ");
		//inputPassword = input.next();
		//method for user details match
		boolean quitMainmenu = false;
		// Main Menu options
		
		System.out.println("Main Menu Options");
		System.out.println("==================");
		System.out.println("1 - Display Account details");
		System.out.println("2 - Deposit Money");
		System.out.println("3 - Withdraw Money");
		System.out.println("4 - Buy transaction");
		System.out.println("5 - Sell transaction");
		System.out.println("6 - View Transaction report");
		System.out.println("7 - Quit");
		System.out.println("Please enter your choice from 1 to 7 : " );
		
		//case 3:
			//exit();
			
		default:
			System.out.println("Invalid choice! Please enter the correct choice from 1 to 3");
			mainSelection();
	}
	
}
	
	public static void main(String args[]){
		// Starting Menu
		mainSelection();
	}
}
