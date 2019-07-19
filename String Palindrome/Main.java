import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    int str1_len = str1.length();
      int front=0;
      int end=str1_len-1;
      boolean isPalindrome=true;
      for(int i=0;i<str1_len;i++)
      {
      if(str1.charAt(front)!=str1.charAt(end))
      {
       isPalindrome=false;
        break;
      }
        end--;
        front++;
      }
      if(isPalindrome==true)
      {
       System.out.println("Yes"); 
      }
      else
      {
        System.out.println("No");
      }
    } 
}