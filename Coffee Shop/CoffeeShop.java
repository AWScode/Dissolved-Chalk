import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] args) {
  System.out.println(" ");
  System.out.println("Welcome to HappyCafe. May I take your order?");
  Scanner order=new Scanner(System.in);
  String theirOrder=order.nextLine();
  System.out.println("What is your name?");
  Scanner name=new Scanner(System.in);
  String theirName=name.nextLine();
  System.out.println("Please wait...");
  System.out.println(theirName + "! Your " + theirOrder + " is ready! :)");
  System.out.println(" ");
  //my name is Rachel and the date is 9/11...
  }
}
