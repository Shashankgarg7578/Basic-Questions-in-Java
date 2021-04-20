package Star_Pattern;

public class StarPattern05 
{
  public static void main(String[] args) 
  {
	boolean k;
	int i,j;
	for(i=1;i<=5;i++)
	{
	  	for( j=1; j<=9 ;j++)
	  	{
	  	    k=true;
	  		if(j>=6-i && j<=4+i && k)
	  		{
	  			System.out.print("*");
	  			k=false;
	  		}
	  		else
	  		{
	  			System.out.print(" ");
	  			k=true;
	  		}
	  	}
	  	System.out.println();
	}
	
  }	
  
}
