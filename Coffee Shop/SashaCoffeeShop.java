import java.util.Scanner;
public class SashaCoffeeShop {
    public static void main(String[] args) {
      System.out.println("Welcome to NotStarbucks, may I take your order?");
      Scanner scan = new Scanner(System.in);
      String order = scan.nextLine();
      System.out.println("Can I get your name for that?");
      Scanner scann = new Scanner(System.in);
      String name = scann.nextLine();
      System.out.println( name + ", your " + order + " is ready!");
  }
//Sasha Chang 9/11/17
}
