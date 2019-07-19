import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
   // int n=str.length();
    String arr[]=str.split(" ");
    // int n=arr[].length();
   // String[] temp="";
    for(int i=0;i<arr.length;i++)
    {
     if(arr[i]!=null)
     {
       for(int j=i+1;j<arr.length;j++)
       {
        if(arr[j].equals(arr[i]))
        {
         arr[i]=null; 
        }
       }
     }
    }
    for(int k=0;k<arr.length;k++)
    {
      if(arr[k]!=null)
          System.out.print(arr[k]+" "); 
    }
  }
}