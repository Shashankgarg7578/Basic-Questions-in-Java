package C_Basic_Programs_In_Java;

public class Swap_Number_without_thirdVariable 
{
 public static void main(String[] args)
 {
    int a=10,b=20;
    System.out.println("A ="+a+" "+"B ="+b);
    a=a+b;//30
    b=a-b;
    a=a-b;
    System.out.println("A ="+a+" "+"B ="+b);

 }
}
