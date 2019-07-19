import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int n=printNatNum(num);
      System.out.println(n);
    }
  public static int printNatNum(int num)
  {
    if(num==0)
    {
     return 0; 
    }
   if(num==1)
   {
    return num; 
   }
    else
    {
     return num+printNatNum(num-1); 
    }
  }
}