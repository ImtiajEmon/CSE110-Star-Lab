import java.util.Scanner;
public class Lab08Task16r
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    for(int i=1;i<=num1;i++)
    {
      for(int j=1;j<=i;j++)
      {
        if(i==1||i==2||i==num1||j==1||j==i)
        System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}