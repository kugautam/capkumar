package com.demo.test;

import java.util.Arrays;

public class CommandLineSorted
{

	public static void main(String[] args)
	{
		 
		Arrays.sort(args);
		
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}

}
