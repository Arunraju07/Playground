//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
/*	public void setItem(String item)
    {
     this.item=item; 
    }
  public String getItem();
  {
    return this.item;
  }*/

}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setTag(int p,int q)
  {
   int priceTag=p*q;
    System.out.println("Total Price is : "+priceTag);
  }
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String item=in.nextLine();
    int price=in.nextInt();
    int NOI=in.nextInt();
    Item i = new Item();
 //   i.setItem(item);
   // System.out.println(getItem());
    Customer c = new Customer();
    c.setTag(price,NOI);
    Bill obj = new Bill();
    //write the logic here
  }
}