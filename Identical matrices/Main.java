import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int flag=1;
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
       a[i][j]=in.nextInt();
     }
    }
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
       b[i][j]=in.nextInt();
     }
    }
    identical(a,b,r,c);
 
  }
  public static void identical(int a[][],int b[][],int r,int c)
  {
    int flag=0;
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      if(a[i][j]==b[i][j])
      {
        flag=1;
     }
       else
       {
		flag=0;
         break;
       }
       
    }
      }
    if(flag>0)
       System.out.println("Yes");
    else   
        System.out.println("No"); 
}
}