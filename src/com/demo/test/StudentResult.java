package com.demo.test;

import java.util.Scanner;

public class StudentResult
{
	private double sub1;
	private double sub2;
	private double sub3;

	public StudentResult(double sub1, double sub2, double sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public void total()
	{
		if(sub1>60 && sub2>60 && sub3>60)
			System.out.println("Pass");
		else if((sub1>60 && sub2>60)||  (sub2>60 && sub3>60) || (sub1>60 && sub3>60))
			System.out.println("Promoted");
		else if((sub1<60 && sub2<60 && sub3<60) || (sub1>60 || sub2>60 || sub3>60))
			System.out.println("Failed"
					+ "\n Do well in Coming Exam" );
	}
	public static void main(String[] args) 
	{
		
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mark of First Subject:");
        int sub1=scanner.nextInt();
        System.out.println("Enter the mark of Second Subject:");
        int sub2=scanner.nextInt();
        System.out.println("Enter the mark of Third Subject:");
        int sub3=scanner.nextInt();

        StudentResult studentResult=new StudentResult(sub1, sub2, sub3);
        studentResult.total();
        scanner.close();
	}

}
