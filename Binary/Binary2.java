import java.util.*;
public class Binary2{
  public static void main(String[] args) {
    System.out.println("Hello! Welcome to java Binary!");
    System.out.println("What is your first binary number?");
    Scanner i1 = new Scanner(System.in);
    String input1 = i1.nextLine();
    System.out.println("A second number?");
    Scanner i2 = new Scanner(System.in);
    String input2 = i2.nextLine();
    Binary2 hello = new Binary2();
    System.out.println (hello.bAddition(input1, input2));
  }

  private String bAddition(String n1, String n2){
    int length1= n1.length()-1;
    int length2= n2.length()-1;
    StringBuilder hi = new StringBuilder();
    int carry=0;
    while (length1>=0||length2>=0){
      int sum=carry;
      if(length1>=0){
        sum+=n1.charAt(length1)-'0';
        length1--;}
      if(length2>=0){
        sum+=n2.charAt(length2)-'0';
        length2--;}
      carry = sum >> 1;
      sum = sum & 1;
      hi.append (sum == 0? '0' : '1');
    }
    if (carry>0) hi.append('1');
    hi.reverse();
    return String.valueOf(hi);
  }
}
