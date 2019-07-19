import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int num,f,m,l,n;
    Scanner in = new Scanner(System.in);
    num=in.nextInt();
    f=num/100;
    l=num%10;
    n=num/10;
    m=n%10;
    System.out.print(l);
    System.out.print(m);
    System.out.print(f);
    
  }
}