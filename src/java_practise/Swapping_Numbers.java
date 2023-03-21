package java_practise;

import java.util.Scanner;

public class Swapping_Numbers {

	public static void main(String[] args) {
		
	
		// Swapping two numbers with third variable
		
		/*	Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Value X and Y");
		int X=sc.nextInt();
		int Y=sc.nextInt();
		System.out.println("Before Swapping two Numbers:"+X+"   "+Y);
		int t=X;
		X=Y;
		Y=t;
		System.out.println("After Swapping two Numbers:"+X+"   "+Y);*/
		
		// Swapping two numbers without third variable
		
	/*	int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping two Numbers:" +x+"  "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping Two Numbers:"+x+"  "+y);*/
		
		
		//Swapping two numbers without third variable Using Multiplication and Division 
		
		
	/*	int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two Numbers a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping two Numbers:" +a+"  "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping two Numbers:" +a+"  "+b); */
		
		
		//Swapping two numbers without third variable Using Bitwise Operator
	/*	int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two Numbers a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping two Numbers:" +a+"  "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping two Numbers:" +a+"  "+b); */
		
		//Swapping two numbers Single statement
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two Numbers:a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping two Numbers:" +a+"  "+b);
		
		b=a+b-(a=b);
		System.out.println("After Swapping two Numbers:" +a+"  "+b); 
		
		
		
		
		
		
		
	}

}
