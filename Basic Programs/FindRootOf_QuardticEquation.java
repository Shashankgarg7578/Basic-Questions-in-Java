package C_Basic_Programs_In_Java;
import java.lang.Math;
public class FindRootOf_QuardticEquation 
{
	void  find_root(int a,int b,int c)
	{
		if(a==0)
		{
			System.out.println("it is not a Quarditic Equation ");
		}
		
	int P = b^2 - 4 * a *c;
    double arc = Math.sqrt(P);
    
    if(P>0)
    {
    	 System.out.println("Roots are real and different \n"); 
    
    	System.out.println((double)((-b+Math.sqrt(arc))/2*a)+"\n"+(double)(-b-Math.sqrt(arc))/(2*a));
    }
    else // d < 0 
    { 
       System.out.println("Roots are complex \n"); 
 
       System.out.println(( -(double)b / ( 2 * a ) + " + i" 
                         + Math.sqrt(arc) )+ "\n"  + (-(double)b / ( 2 * a ) 
                         + " - i" + Math.sqrt(arc))); 
	}
	}

public static void main(String[] args) 
 {
	 FindRootOf_QuardticEquation FQ = new FindRootOf_QuardticEquation();
	 int x=1,y=-7,z=12;	
     FQ.find_root(x,y,z);
 }
  
}
