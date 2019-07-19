import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      System.out.println(gcdOfThreeNum(num1,num2,num3));
    }
      
public static int gcdOfThreeNum(int n1,int n2,int n3)
{  
  int n4=0,gcd=0,i=1,minNum;
  if(n1>n2)
    minNum=n2;
  else
     minNum=n1;

  while(i<=minNum)
  {
   if((n1%minNum==0)&&(n2%minNum==0))
  {
   	 n4=minNum;
     break;
  }
    minNum--;
  }
  
  if(n3>n4)
    minNum=n4;
  else
    minNum=n3;
  while(i<=minNum)
  {
    if((n3%minNum==0)&&(n4%minNum==0))
    {
     gcd=minNum;
     break;
    }
    minNum--;

  }
   return gcd;
}
 
}



      
      
      
	

	
