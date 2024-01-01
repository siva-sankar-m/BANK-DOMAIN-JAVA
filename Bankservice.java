package com.banking.service;

public class Bankservice 
{
	BankUser b1;
	public BankUser login(int pin) 
	{
		if (pin==1111)
		{
			b1=new Atm();
			System.out.println("welcome to atm");
			return b1;
		}
		else if (pin ==2222)
		{
			b1=new Phonepe();
			System.out.println("welcome to Phonepe");
			return b1;
		}
		else if  (pin ==3333)
		{
			b1=new Gpay();
			System.out.println("welcome to Gpay");
			return b1;
		}
		else {
			System.out.println("invalid pin");
			return b1;
		}
		}


	}
