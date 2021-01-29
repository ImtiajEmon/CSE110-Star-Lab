import java.util.Scanner;
public class Main
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int p=sc.nextInt();
    int n=sc.nextInt();
    int j=0,e=1;
    for(int i=1;i<=n;i++)
    {
      int l=sc.nextInt();
      if(l>j)
      {
        if(l-j>p)
        {
          System.out.println("GAME OVER");
          break;
        }
      }
      j=l;
      e++;
    }
    if(e>n)
      System.out.println("YOU WIN");
  }
}

    