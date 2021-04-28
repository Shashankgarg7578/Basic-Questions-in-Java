package C_Basic_Programs_In_Java;

import java.util.Scanner;

public class Swap_Numbers
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	     int a,b,x;
	     System.out.println("Enter A And B");
	     a = sc.nextInt();
 	     System.out.println();
 	     b= sc.nextInt();
 	    System.out.println("A ="+a+", B ="+b);
 	     x=a;
 	     a=b;
 	     b=x;	     
 	    System.out.println("A ="+a+", B ="+b);
  }
}
