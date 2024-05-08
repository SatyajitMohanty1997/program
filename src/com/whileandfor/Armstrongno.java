package com.whileandfor;

public class Armstrongno {
 static int power(int base,int ex) {
	int pow=1;
	for(int i=1;i<=ex;i++) {
		pow=pow*base;
	}
	return pow;
}
 static int count(int m) {
	 int c=0;
	 while(m!=0)
	 {
		 c++;
		 m=m/10;
		 
	 }
	 return c;
 }
 public static void main(String[] args) {
	int n=153;
	int n1=n;
	int ex=count(n);
	int rem=0;
	int sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+power(rem,ex);
		n=n/10;
	}
	if(sum==n1)
	{
		System.out.println("Armstrong number");
		
	}
	else
	{
		System.out.println("Not a Armstrong no");
	}
			
}
 
 
}
