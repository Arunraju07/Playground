import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n,f,l,sum=0;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      l=n%10;
      while((n/10)!=0)
      {
        n/=10;
      
      }
      f=n%10;
      sum=l+f;
      System.out.println(sum);
        
	}
}