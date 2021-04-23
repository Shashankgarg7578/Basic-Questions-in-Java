package Number_Pattern;

import java.util.Scanner;

public class NumPattern05 
{
  public static void main(String[] args) 
  {
	  System.out.print("Enter a number:");
	  Scanner sc = new Scanner(System.in);
	  int row = sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		int k=1;
		for(int j=1;j<=row;j++)
		{
			if(j<=i)
			{
				System.out.print(k);
				k = 1-k;
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
  }
}
