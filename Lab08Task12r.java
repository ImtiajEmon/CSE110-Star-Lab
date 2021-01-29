import java.util.Scanner;
public class Lab08Task12r
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    int k=1;
    for(int i=1;i<=num1;i++)
    {
      for(int p=0;p<num1-i;p++)
        System.out.print(" ");
      for(int j=1;j<=k;j++)
      
        System.out.print("*");
        
      System.out.print("\n");
      k+=2;
    }
    k-=4;
    for(int i=1;i<num1;i++)
    {
      for(int j=1;j<=i;j++)
        System.out.print(" ");
      for(int p=1;p<=k;p++)
        System.out.print("*");
    System.out.print("\n");
      k-=2;
    }
  }
}