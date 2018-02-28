import java.util.*;

public class Binary5 {
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

    int theResult [] = new int[8];

    //addition +++
    if (which.equals("+")){
      for(int k=0;k<8;k++){
        while(nNum1 [k]==2){//pre-check for if (after adding) the number in that spot = 2, then...
        nNum1 [k]=0;
        nNum1 [k+1]=nNum1 [k+1]+1;//makes the next value 1 or 2 (if two it goes through loop again...:)
        }
        if(nNum1 [k]==0||nNum2 [k]==0){
          theResult [k] = nNum1 [k] + nNum2 [k];//does the simple adding (while loop fixes problem of 2)
        }
        else{
          theResult[k]=0;
          nNum1 [k+1]= nNum1[k+1]+1;//also helps prob with 2 (the other one solves problems that show up, this stops prior)
        }
      }
    }

    //subbbbtractionnnnnnnn
    if(which.equals("-")){
      for(int o=0;o<8;o++){
      while(nNum1 [o]==-1){//similar to other bit (pre-check) for if the number is negative one
      nNum1 [o]=1;
      nNum1 [o+1]=nNum1 [o+1]-1;//the next one will be minus one instead (if there's an issue it goes through loop again)
      }
      if((nNum1 [o]==0 && nNum2 [o]==0)||nNum1 [o]==1){
        theResult [o]=nNum1 [o]-nNum2 [o];
      }
      else{
        theResult[o]=1;//just realized o versus 0 is confusing...
        nNum1 [o+1]= nNum1[o+1]-1;
      }
    }
    }

    //*multiplication**** (<these look like snowflakes...merry x-mas..)
    if(which.equals("*")){
      int multiply1 [] =new int[8];//numer 2's first digit/number multiplied w/ the ENTIRE numer 1
      for(int q=0; q<8; q++){
        multiply1 [q] =nNum1[q]*nNum2[0];
      }
      int multip2 [] =new int[8];//opposite of the other one
      multip2 [0]=0;
      for(int u=1; u<8; u++){
        multip2 [u] =nNum1[u-1]*nNum2[1];
    }




  }
}}
