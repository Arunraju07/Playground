import java.util.Scanner;
class Main
{
	public static int SqOfNum(int n)
    {
      return n*n;
    }
  
  public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int SqNum=SqOfNum(n);
      System.out.println(SqNum);
	} 
}