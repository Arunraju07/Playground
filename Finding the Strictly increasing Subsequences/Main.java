import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
     a[i]=in.nextInt(); 
    }
    for(int i=0;i<n-1;i++)
    {
     for(int j=i+1;j<n;j++)
     {
       if(a[i]<a[j])
        {
          
          if(sum<a[j])
          {
            sum=a[j];
              System.out.println(a[i]+","+sum);
          }
        }
      
     }
      sum=0;
    }
  }
}