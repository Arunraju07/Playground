import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int temp[]=new int[n];
      for(int i=0;i<n;i++)
      {
       arr[i]=in.nextInt(); 
      }
       for(int j=0;j<n;j++)
      {
       temp[j]=0; 
      }
		int miss_ele;
      for(int k=1;k<=n;k++)
      {
        for(int l=0;l<=n-1;l++)
        {
          if(arr[l]==k)
            break;
          else
          {
			if((arr[l]!=k)&&(l==n-1))
              System.out.println(k);
            else
              continue;
          }
        }
      }
    }
}