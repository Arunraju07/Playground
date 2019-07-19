import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int f,m,l,n,sum;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      f=n/100;
      l=n%10;
      sum=f+l;
      System.out.println(sum);
	}
}