import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s=in.nextLine();
    StringBuilder str=new StringBuilder(s); 
    int key=in.nextInt();
    int strLen=str.length();
    for(int i=0;i<strLen;i++)
    {
      char c=str.charAt(i);
     if(c>='A' && c<='Z')
     {
       int offset=c-'A';
       offset=(offset-key)%26;
       c=(char)(offset+'A');
      }
      if(c>='a' && c<='z')
       {
         int offset=c-'a';
       offset=(offset-key)%26;
        if(offset<0)
          offset=offset+26;
       c=(char)(offset+'a');
       }
      str.setCharAt(i,c);
    }
      System.out.print(str);
    
  }
}