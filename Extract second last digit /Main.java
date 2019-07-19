import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      int n1,l,f;
      Scanner in=new Scanner(System.in);
      n1=in.nextInt();
      f=n1/10;
      l=f%10;
      System.out.println(l);
	}
}