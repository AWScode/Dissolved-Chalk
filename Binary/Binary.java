
import java.util.*;
public class Binary{
  public static void main(String[] args) {
    System.out.println("Hello! Welcome to java Binary!");
    System.out.println("What is your first binary number?");
    Scanner input1 = new Scanner(System.in);
    String theirInput1 = input1.nextLine();
    ArrayList<Integer> num1= new ArrayList<Integer>();
    for(int k=0; k<8; k++){num1.add(k);}
    int length1 = theirInput1.length();
    int newL = 8 - length1;

    /*Used to test where error was: String trial = theirInput1.substring(0,1);
    System.out.println(Integer.parseInt(trial));*/

    for(int i=0; i<newL; i++){
      num1.set(i,0);
    }
    for(int q=0; q<length1-1; q++){
      String p = theirInput1.substring(q,q+1);
      int pNum = Integer.parseInt(p);
      num1.set(length1-1, pNum);
      length1=length1+1;
    }
    //printArray(num1);
  }

/*
     private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
           if (i > 0) {
              System.out.print("");
           }
           System.out.print(anArray[i]);
        }
     }*/

}
