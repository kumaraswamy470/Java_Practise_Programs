package java_practise;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
	//  2 3 5 7 11 13 17
		
		
		/*	int num,count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter Number:num");
			num=sc.nextInt();
			if(num>1) 
			{
			for(int i=1;i<=num;i++)	{
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("prime Number");
			}else {
				System.out.println("not prime number");
			}
			
			}
				else {
					
				System.out.println("num is not greater than zero");
				}*/
			
	
		
	/*	int i,j,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enrter number: num");
		num=sc.nextInt();
		boolean isPrime;
		
		for(i=2;i<=num;i++) {
			isPrime=true;
			
		//for(j=2;j<=i/2;j++)	
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(i+"  ");
			}
				
			
		}*/
		
	/*	int ct=0,num=0,i=1,j=1;
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Please Enrter number: num");
		num=sc.nextInt(); */
	/*	while(num<25) {
			j=1;
			ct=0;
			while(j<=i) {
				if(i%j==0)
					ct++;
				j++;
			}
			if(ct==2) {
				System.out.printf(" %d ",   i);
				num++;
			}
			i++;
		} */
		
		
		int i=0,num=0;
		String str="";
		for(i=1;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter=counter+1;
				}
			}if(counter==2) {
				str=str+i+" ";
			}
		}
		System.out.println("Prime number from 1 to 100 are :");
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
