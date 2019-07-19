import java.util.Scanner;
class Main
{
 public static int powerOfNum(int base,int exp)
 {
  int pof=1;
   while(exp!=0)
   {
     pof=pof*base;
     exp--;
   }
   
   return pof;
 }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int pof=powerOfNum(base,exp);
    System.out.println(pof);
  }
}