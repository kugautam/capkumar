package com.demo.test;

public class Account 
{
	private double amount;
	private double interest;
	private int time;
	private int rate;
	private double compound;
	
	public Account(double amount, int time, int rate) 
	{
		super();
		this.amount = amount;
		this.time = time;
		this.rate = rate;
	}
	
	public double simpleInterest()
	{
		interest=(amount*time*rate)/100;
		return interest;
	}
	public boolean deposit()
	{
	    simpleInterest();		
		compound= amount*(Math.pow((1+ rate/100.0),time));
				
		double TotalAmount1=amount+interest;
		double TotalAmount2 = amount+compound;
	    System.out.println(TotalAmount1);
	    System.out.println(TotalAmount2);
		System.out.println(TotalAmount1+TotalAmount2);
		return false;
	}
	public static void main(String[] args)
	{
        Account account=new Account(100,4,5);
        account.deposit();
	}

}
