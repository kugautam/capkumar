package com.demo.test;

public class DateSwapping implements Cloneable
{
	private int day;
	private int month;
	private int year;



	public DateSwapping() {
		super();
	}




	public DateSwapping(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}






	public int getDay() {
		return this.day;
	}




	public void setDay(int day) {
		this.day = day;
	}




	public int getMonth() {
		return month;
	}




	public void setMonth(int month) {
		this.month = month;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}

	public void display()
	{   

		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	public void swap(Object object,Object object2)
	{


		Object temp=object;
		object=object2;
		object2=temp;

	}


	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}


	public static void main(String[] args) throws CloneNotSupportedException 
	{
		DateSwapping date=new DateSwapping();
		date.display();

		DateSwapping date1=new DateSwapping(12,10,2019);
		//date1.setDay(12);
		//date1.setMonth(10);
		//date1.setYear(2019);

		DateSwapping date2=new DateSwapping(10,12,2019);

		System.out.println("1======"+date1.hashCode());
		System.out.println("2====="+date2.hashCode());		

		date.swap(date1.clone(),date2.clone());
		//		date1.display();
		//		date2.display();
		System.out.println("1======"+date1.hashCode());
		System.out.println("2====="+date2.hashCode());		
	}

}
