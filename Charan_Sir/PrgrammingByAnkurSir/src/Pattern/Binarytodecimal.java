package Pattern;

import java.util.Scanner;

public class Binarytodecimal {
public static void main(String[] args) {
	int []a= {1,2,4,8,16,32,64,128};
	int []b= new int [8];
	int c=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter ");
	int limit=s1.nextInt();
	
	for (int i = 0; i <limit; i++) {
		System.out.println("enter binary num::");
		b [i] =s1.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		c=c+b[i]*a[i];
		
	}
	System.out.println(c);
	
}
}
