import java.util.Scanner;
public class Lab08Task15r
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    for(int i=1;i<=num1;i++)
    {
      for(int j=1;j<=num2;j++)
      {
        if(i==1 || i==num1 || j==1 || j==num2)
        System.out.print(j);
        else
           System.out.print(" ");
      }
        System.out.print("\n");
        
    }
  }
}