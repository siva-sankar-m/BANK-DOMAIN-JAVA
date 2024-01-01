package com.banking.utilization;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.service.BankUser;
import com.banking.service.Bankservice;

public class MainUser
{
	public static void menu()
	{
		System.out.println("enter 1111 for Atm \n2222 for Phonepay \n3333 for Gpay");
	}
	public static void main(String[] args) 
	{
		menu();
		Transaction t1 = new Transaction();
		Account a1 = new Account();
		Bankservice b1 =  new Bankservice();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin");
		int pin = sc.nextInt();
		switch(pin)
		{
		case 1111:
			BankUser user1 = b1.login(pin);
			System.out.println("enter ammount");
			double amt = sc.nextDouble();
			System.out.println("1.deposit 2.withdraw");
			System.out.println("enter choice");
			int choice = sc.nextInt();
			user1.transaction(amt, t1, choice, a1);
			break;
			
		case 2222:
			BankUser user2 = b1.login(pin);
			System.out.println("enter ammount");
			double amt1 = sc.nextDouble();
			System.out.println("1.deposit 2.withdraw");
			System.out.println("enter choice");
			int choice1 = sc.nextInt();
			user2.transaction(amt1, t1, choice1, a1);
			break;
			
		case 3333:
			BankUser user3 = b1.login(pin);
			System.out.println("enter ammount");
			double amt2 = sc.nextDouble();
			System.out.println("1.deposit 2.withdraw");
			System.out.println("enter choice");
			int choice2 = sc.nextInt();
			user3.transaction(amt2, t1, choice2, a1);
			break;
			
		default: System.out.println("invalid pin");	
		}
	}
}