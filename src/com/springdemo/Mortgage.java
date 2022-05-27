package com.springdemo;

import java.text.NumberFormat;
import java.util.Scanner;


public class Mortgage {

	public static void main(String[] args) {
		final byte monthsInYear = 12;
		final byte percent = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: ");
		double principal = scanner.nextDouble();
		
		System.out.print("Annual interest rate: ");
		float annualInterestRate = scanner.nextFloat();
		float monthlyInterestRate = annualInterestRate / percent / monthsInYear;
		
		System.out.print("Number of payments: ");
		int numberOfPayments = scanner.nextInt();
		
		double mortgage = (double)principal * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments)) / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1));
		
		//System.out.println("principal: " + principal);
		//System.out.print("Annual Interest Rate: "+ annualInterestRate + "\nMonthly Interest Rate: "+ monthlyInterestRate);
		//System.out.println("\nNumber of payments: "+ numberOfPayments);
		System.out.print("Your mortgage is: " + mortgage);
	}

}
