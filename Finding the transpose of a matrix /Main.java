import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int matrix[][]=new int[r][c];
    int transpose[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      matrix[i][j]=in.nextInt(); 
     }
     }
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      transpose[i][j]=matrix[j][i]; 
     }
     }
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
      System.out.print(transpose[i][j]+" ");
     }
      System.out.println();
     }
    
  }
}