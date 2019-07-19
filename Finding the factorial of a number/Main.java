import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    int n=printFact(num);
    System.out.println(n);
  }
  public static int printFact(int num)
  {
    if(num==0)
      return 0;
   if(num==1)
   {
    return num; 
   }
    else
    {
      return num*printFact(num-1);
    }
    
    
  }
}