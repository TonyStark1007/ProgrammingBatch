package Programming;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter Binary num::");
		int num=s1.nextInt();
		int de=0;
		int count=0;
		while(num>0) {
			int rem=num%10;
			de=de+rem*power(2,count);
			count++;
			num=num/10;
		}
		System.out.println("decimal value is ::"+de);
	}

	public static int power(int num, int pw) {
	    int val=1;
	while(pw>0) {
		val=val*num;
		pw--;
	}
	return val;
		
	
	}
	
}
