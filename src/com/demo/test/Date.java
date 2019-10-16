package com.demo.test;

public class Date
{
     private int day;
     private int month;
     private int year;
     
     
	public int getDay()
	{
		return day;
	}


	public void setDay(int day)
	{
		this.day = day;
	}


	public int getMonth()
	{
		return month;
	}


	public void setMonth(int month)
	{
		this.month = month;
	}


	public int getYear()
	{
		return year;
	}


	public void setYear(int year) 
	{
		this.year = year;
	}

	public Date()
	{
		System.out.println("Default Constructor");
	}

	
	public Date(int day, int month, int year) 
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
    
	public void m1(java.util.Date O)
	{
		System.out.println(O);
		
		//
	}
	
	

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}


	public static void main(String[] args)
	{
	       new Date(54, 45, 675).m1( new java.util.Date());
	}

}
