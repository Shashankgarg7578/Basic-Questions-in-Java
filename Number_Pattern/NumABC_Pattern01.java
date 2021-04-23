package Number_Pattern;

public class NumABC_Pattern01 
{
  public static void main(String[] args)
  {
   for(int i=1;i<=4;i++)
   {
	  char k = 49; 
	  
	   for(int j=1;j<=7;j++)
	   {
		   if(j>=5-i && j<=3+i)
		   {
			   System.out.print(k);
			   k++;
			   if(j==4)
			   {
				   k=65;
			   }   
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
