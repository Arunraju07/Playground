import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder str=new StringBuilder(s);
      int str_len=str.length();
      int arr_size=26;
      int a[]=new int[26];
      for(int k=0;k<arr_size;k++)
      {
       a[k]=0; 
      }
      for(int i=0;i<str_len;i++)
      {
       if(str.charAt(i)>='a' && str.charAt(i)<='z')
       {
         a[str.charAt(i)-'a']++;
       }
       if(str.charAt(i)>='A' && str.charAt(i)<='Z')
       {
         a[str.charAt(i)-'A']++;
      }
      }
      for(int j=0;j<arr_size;j++)
      {
       
            
        if(a[j]==0)
       {
          char missAlph=(char)(j+'a');
        System.out.print(missAlph+" ");             }
      }
    }  
}