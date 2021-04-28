package C_Basic_Programs_In_Java;

import java.util.Scanner;
public class Input_integer_only
{
	static boolean Cheak(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Interger number :-");	
        String a = sc.next();
       
       if(Cheak(a))
       {
          System.out.println("this Number is Correct");
       }
       else
       {
    	   System.out.println("this number is no Integer Enter a valid number");
       }
    }
}
