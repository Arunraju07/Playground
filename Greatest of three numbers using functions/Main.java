import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      System.out.println(GOT(num1,num2,num3));
    
	}
  public static int GOT(int n1,int n2,int n3)
  { int gNum,GN;
    if(n1>n2)
       gNum=n1;
    else
        gNum=n2;
    if(gNum>n3)
       GN=gNum;
    else
       GN=n3;
    return GN;
    
  }
}