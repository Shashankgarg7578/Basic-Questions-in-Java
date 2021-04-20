package Star_Pattern;
import java.util.Scanner;

public class StarPattern04
{
 public static void main(String[] args) 
 {
	 System.out.print("Enter a value :-");
  Scanner sc = new Scanner(System.in)	;
  int sp = 0;
  int n = sc.nextInt();
  int st = n;
  for(int i=1 ; i<=n;i++)
  {
	  for(int j = 1 ; j<=sp;j++)
	  {
		  System.out.print(" ");
	  }
	  for(int j=1 ; j<=st;j++)
	  {
		  System.out.print("*");
	  }
	  sp++;
	  st--;
	  System.out.println();
  }
	

 }
}
