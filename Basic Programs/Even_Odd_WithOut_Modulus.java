package C_Basic_Programs_In_Java;

import java.util.Scanner;

public class Even_Odd_WithOut_Modulus 
{ 
	public static void main(String[] args) 
    {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :-");
		   int a = sc.nextInt();
		   if((a&1)==0)//((a*2)/2==0)
		   {
			   System.out.println("Even number");
		   }
		   else
			   System.out.println("odd number");
    }
   
}
