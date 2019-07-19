import java.util.Scanner;
class Main{
  
public static void main(String[] args)
    {
	    // Type your code here
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
      primeNum(num);
    	}

public static void primeNum(int num)
  {
    for (int i = 1; i <=num; i++)         
       { 		  	  
          int counter=0; 	  
          for(int j =i; j>=1; j--)
	  {
             if(i%j==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
        System.out.println(i);
     }
    }
}
}