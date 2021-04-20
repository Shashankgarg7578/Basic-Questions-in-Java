package Star_Pattern;

public class StarPattern01 
{
  public static void main(String[] args) 
  {
	for(int i = 1 ; i<= 5 ; i++)
	{
		
		//jitne i honge utne Star Print kr dega
		for(int j = 1 ; j<=5 ; j++)
		{
			if(j<=i)
			{
				System.out.print("*");
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
