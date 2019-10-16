package com.demo.test;

public class ComplexNumber
{
	private double real;
	private double img;


	public ComplexNumber()
	{
		super();
	}


	public ComplexNumber(double real, double img) 
	{
		super();
		this.real = real;
		this.img = img;
	}


	public ComplexNumber sum(ComplexNumber c2)
	{

		double real = this.real + c2.real;
		double img = this.img + c2.img;

		return new ComplexNumber(real, img);
	}


	public ComplexNumber difference(ComplexNumber other)
	{

		double real = this.real - other.real;
		double img = this.img - other.img;

		return new ComplexNumber(real, img);
	}


	public ComplexNumber mul(ComplexNumber other)
	{

		double real = this.real*other.real - this.img*other.img;
		double img = this.img*other.real + this.real*other.img;

		return new ComplexNumber(real, img);
	}


	public void swap(ComplexNumber c1, ComplexNumber c2)
	{

		ComplexNumber temp = c1;
		c1 =c2;
		c2= temp;

	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", img=" + img + "]";
	}


	public static void main(String[] args)
	{
		ComplexNumber complexNumber=new ComplexNumber(12,10);	
		ComplexNumber com = complexNumber.sum(complexNumber);
		
		System.out.println(com);

	}


}
