import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
     // System.out.println(num);
       int p,sum=0,total=0,temp=0;
      temp=num;
      while(num%10!=0)
      {
        p=num%10;
        int fact=1;
        for(int i=1;i<=p;i++)
        {  
          
          fact=fact*i;
        }
        num/=10;
        sum=sum+fact;
        }
      // System.out.println(num);
      // System.out.println(sum);
        
      if(temp==sum)
         System.out.println("Yes");
      else
        System.out.println("No");
	}
}