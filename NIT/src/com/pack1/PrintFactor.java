package com.pack1;

import java.util.Scanner;

public class PrintFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		if(num<=0)
			System.out.println("Invalid Number");
		else {
			System.out.print("Factors of " + num + " are: ");
			for (int i = 1; i <num; ++i) {
			      if (num % i == 0)
			        System.out.print(i + " ");
			    }
		}
	}

}
