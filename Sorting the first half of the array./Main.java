import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=in.nextInt(); 
    }
    
/*    for(int j=1;j<n-1/2;j++)
    {
     int key=a[j];
     int x=j-1;
      while((a[x]>key) && (x>=0))
      {
       a[x+1]=a[x];
        x--;
       }
      a[x+1]=key;
     }*/
            for (int i = 0; i < n/2; i++) 
        {
            for (int j = i + 1; j < n/2; j++) 
            {
                if (a[i] > a[j]) 
                {
                   int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    for(int k=0;k<n;k++)
       System.out.print(a[k]+" ");
      
  }
}