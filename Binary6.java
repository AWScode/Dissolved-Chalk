import java.util.*;
import java.util.Arrays;

public class Binary6 {
  public static void main(String[] arg){
    Scanner heyo= new Scanner(System.in);
    System.out.println("Hello! Welcome to java Binary!");
    System.out.println("What is your first binary number?");
    String num1= heyo.nextLine();

    Scanner heyo2= new Scanner(System.in);
    System.out.println("A second number?");
    String num2= heyo2.nextLine();

    Scanner heyo3= new Scanner(System.in);
    System.out.println("Choose an operator!(+,-,*,/)");
    String which= heyo3.nextLine();

    //first number
    int nNum1 []=new int[8];
    for (int i=0; i<8; i++) {
      if(i<num1.length()){
        int num1Length =num1.length()-1;
        int nNum1s = Integer.parseInt(num1.substring(num1Length-i,num1.length()-i));
        nNum1 [i]= nNum1s;
      }
      else{
        nNum1[i]=0;
      }
    }

    //second number
    int nNum2 []=new int[8];
    for (int j=0; j<8; j++) {//pretty sure I could keep i as the int variable but...just to be safe I'll use j :)
      if(j<num2.length()){
        int num2Length =num2.length()-1;
        int nNum2s = Integer.parseInt(num2.substring(num2Length-j,num2.length()-j));
        nNum2 [j]= nNum2s;
      }
      else{
        nNum2[j]=0;
        }
    }
    Binary6 hello = new Binary6();
    if (which.equals("+")){
        int theResult2 [] = new int[8];
        theResult2 = hello.bAddition(nNum1, nNum2);
        String sum= Arrays.toString(theResult2);
        System.out.println (sum);}
      else {if(which.equals("-")){
        int theResult2 [] = new int[8];
        theResult2 = hello.bSubtraction(nNum1, nNum2);
        String subEqual= Arrays.toString(theResult2);
        System.out.println (subEqual);
        System.out.println
      }


    }}
    //addition +++
  private static int [] bAddition(int [] n1, int [] n2){
    int theResult [] = new int[8];
      for(int k=0;k<8;k++){
        while(n1 [k]==2){//pre-check for if (after adding) the number in that spot = 2, then...
        n1 [k]=0;
        n1 [k+1]=n1 [k+1]+1;//makes the next value 1 or 2 (if two it goes through loop again...:)
        }
        if(n1 [k]==0||n2 [k]==0){
          theResult [k] = n1 [k] + n2 [k]; //does the most of the adding
        }
        else{
          theResult[k]=0;
          n1 [k+1]= n1[k+1]+1;//also helps prob with 2 (the other one solves problems that show up, this stops prior)
        }
      }
      return theResult;
  } //end of addition (I get confused with so many }'s)

//subtraction --
  private static int [] bSubtraction(int [] n1, int [] n2){
    int theResult [] = new int[8];
      for(int o=0;o<8;o++){
      while(n1 [o]==-1){//similar to other bit (pre-check) for if the number is negative one
      n1 [o]=1;
      n1 [o+1]=n1 [o+1]-1;//the next one will be minus one instead (if there's an issue it goes through loop again)
      }
      if((n1 [o]==0 && n2 [o]==0)||n1 [o]==1){
        theResult [o]=n1 [o]-n2 [o];
      }
      else{
        theResult[o]=1;//just realized o versus 0 is confusing...
        n1 [o+1]= n1[o+1]-1;
      }
    }
    return theResult;
  } //end of subtraction


} //end of everything
