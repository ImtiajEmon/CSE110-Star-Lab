import java.util.Scanner;
public class Lab08Task11r
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    for(int i=1;i<=num1;i++)
    {
      for(int j=1;j<=num1;j++)
      {
        if(j>num1-i)
        System.out.print(j);
      else
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
      