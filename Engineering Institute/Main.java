//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(long m)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+m); 
  }
}
class CSE
{
  public void salary(long m)
  {
    //write your CSE class statements
   long n=m+3000;
    System.out.println("CSE Faculty: "+n);
  }
}
class IT
{
  public void salary(long m)
  {
    //write your IT class statements
    long n=m+5000;
    System.out.println("IT Faculty: "+n);
  
  }
}
class ECE
{
  public void salary(long m)
  {
    //write your ECE class statements
  long n=m+4500;
    System.out.println("ECE Faculty: "+n);
  
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
   // ECE obj = new ECE();
    //implement your required concept here
    Faculty obj1=new Faculty();
    long money=in.nextInt();
    obj1.salary(money);
    CSE cse=new CSE();
    cse.salary(money);
      IT it=new IT();
    it.salary(money);
      ECE ece= new ECE();
    ece.salary(money);
  }
}