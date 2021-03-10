package com.jai;
import java.util.Scanner;
public class UserPage {
	public static void main(String []args) {
		
		//UserPage up=new UserPage();
		System.out.println("Available banks are :\n\tSBI\n\tANDB \n\tIndianBank");
		System.out.print("Enter your Bank:");
		Scanner sc=new Scanner(System.in);
		String bName=sc.nextLine();
		System.out.println("Enter Amount to take Loan");
		double amount=sc.nextDouble();
	/*	System.out.println("Enter months to pay");
		int month=sc.nextInt();
		*/
		CalculateInt Ci=new CalculateInt(bName,amount);
		
		System.out.println("interest for month is: "+Ci.totalint);
		sc.close();
	}

}
