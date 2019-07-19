import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num,q,r,sum;
      Scanner in=new Scanner(System.in);
      num=in.nextInt();
      q=num/10;
      r=num%10;
      sum=q+r;
      System.out.println(sum);
      
	}
}