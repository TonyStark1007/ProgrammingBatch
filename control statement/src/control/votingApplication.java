package control;

import java.util.Scanner;

public class votingApplication {

	public static void main(String[] args) {
		System.out.println("program started");
	    System.out.println("plz enter you name ");
	    Scanner sc1=new Scanner(System.in);
	    String name=sc1.next();
	    System.out.println("enter your age");
	    int age=sc1.nextInt();
	    if(age>=18)
	    {
	    	System.out.println(name+ "you are eligible ");
	    }
	    else
	    {
	    	System.out.println("pogo dekh beta ");
	    	sc1.close();    }
	}

}
