package com.demo.test;

public class Account1 
{
	private double grandTotal;
	private double amount;
	private double x;
	
    
	public boolean deposit()
	{
		grandTotal=amount+x;
		//System.out.println("GrandTotal After Deposit:"+ " "+grandTotal);
		return false;		
	}
	public String withdraw()
	{
		grandTotal=amount-x;
		//System.out.println("GrandTotal After Withdraw:" + " "+grandTotal);
		return null;
	}
	public void print()
	{
		System.out.println("GrandTotal After Deposit:"+ " "+grandTotal);
		System.out.println("GrandTotal After Withdraw:"+ " "+grandTotal);
	}
	public static void main(String[] args)
	{
        Account1 account1=new Account1();
        account1.deposit();
        account1.withdraw();
        account1.print();
        
	}

}
