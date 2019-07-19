import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]= new int[arr_size];
    for(int i=0;i<arr_size;i++)
    {
      arr[i]=in.nextInt();
    }
  int max=0;
    if(arr[0]>arr[1])
      max=arr[0];
    else
      max=arr[1];
    for(int j=0;j<arr_size;j++)
    {
      if(max<arr[j])
        max=arr[j];
      
    }
    for(int k=0;k<arr_size;k++)
    {
      if(max==arr[k])
         System.out.println(k);
    }
  }
}