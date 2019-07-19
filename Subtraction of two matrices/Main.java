import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      a[i][j]=in.nextInt(); 
     }
    }
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      b[i][j]=in.nextInt(); 
     }
    }
      int s[][]=new int[r][c];
      for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      s[i][j]=a[i][j]-b[i][j]; 
     }

    }
		for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
     System.out.print(s[i][j]+" "); 
     }
          System.out.println();
      }

  }
}