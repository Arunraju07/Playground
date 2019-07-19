import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int i=1,n,sum=0;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      
      while((n/10)!=0)
      {
        i=n%10;
        n=n/10;
        
        sum=sum+i;
        
      }
      sum=sum+n;
        System.out.println(sum);
     
	}
}