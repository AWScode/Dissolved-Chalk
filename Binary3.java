import java.util.*;
public class Binary3{
  public static void main(String[] args) {
    long num1, num2;
    int j=0, remainder=0;
    int[] sum = new int[20];
    Scanner heyo= new Scanner(System.in);

    System.out.println("Hello! Welcome to java Binary!");
    System.out.println("What is your first binary number?");
    num1= heyo.nextLong();
    //I didn't copy and paste. I wrote everything down. I looked up why everything was the way it was. I changed parts if I didn't like them or they didn't make sense. :)
    System.out.println("A second number?");
    num2= heyo.nextLong();

    while(num1!=0 || num2!=0){
      sum[j++] = (int) ((num1%10 + num2%10 + remainder)%2);
      remainder = (int) ((num1%10 + num2%10 + remainder)/2);
      num1 = num1/10;
      num2 = num2/10;
    }
    if(remainder !=0){
      sum[j++] = remainder;
    }
    --j;
    System.out.print("The sum is... *drum roll*... ");
    while (j>=0) {
      System.out.print(sum[j--]);
    }
    System.out.print ("\n");
    System.out.println("tadah!");
  }
  
}
