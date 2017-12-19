import java.util.*;
import java.util.Arrays;

public class Binary8 {
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
    Binary8 hello = new Binary8();
    if (which.equals("+")){
        int theResult [] = new int[8];
        theResult = hello.bAddition(nNum1, nNum2);
        String sum= Arrays.toString(theResult);
        System.out.println (sum);}
      else {if(which.equals("-")){
        int theResult [] = new int[8];
        theResult = hello.bSubtraction(nNum1, nNum2);
        String subEqual= Arrays.toString(theResult);
        System.out.println (subEqual);
      } else{if(which.equals("*")){
        int theResult [] = new int[8];
        theResult = hello.bMultiplication(nNum1, nNum2);
        String product= Arrays.toString(theResult);
        System.out.println (product);
      } else{if (which.equals("/")){
          int theResult [] = new int[8];
          theResult = hello.bDivision(nNum1, nNum2, num1, num2);
          String quotient= Arrays.toString(theResult);
          System.out.println (quotient);
          }
        }
    }}}
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
      n1 [o+1]= n1[o+1]-1;//the next one will be minus one instead (if there's an issue it goes through loop again)
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


//multiplication
  private static int [] bMultiplication(int [] n1, int [] n2){
    Binary8 onlyMulti = new Binary8();
    int theResult [] = new int [8];
      int multiply1 [] =new int[8];//numer 2's first digit/number multiplied w/ the ENTIRE numer 1
      for(int q=0; q<8; q++){
        multiply1 [q] =n1[q]*n2[0];
      }
      int multip2 [] =new int[8];//opposite of the other one
      multip2 [0]=0; //move one to left
      for(int u=1; u<8; u++){
        multip2 [u] =n1[u-1]*n2[1];}
      theResult = onlyMulti.bAddition(multiply1, multip2);

      int multip3 [] =new int[8];
      multip3 [0&1]=0; //left 3X
      for(int b=2; b<8; b++){
        multip3 [b]=n1[b-2]*n2[2];
      }
      theResult = onlyMulti.bAddition(multip3, theResult);

      int multip4 [] =new int[8];
      multip4 [0&1&2]=0;
      for(int a=3; a<8; a++){
        multip4 [a]=n1[a-3]*n2[3];
      }
      theResult = onlyMulti.bAddition(multip4, theResult);

      int multip5 [] =new int[8];
      multip5 [0&1&2&3]=0;
      for(int h=3; h<8; h++){
        multip5 [h]=n1[h-4]*n2[4];
      }
      theResult = onlyMulti.bAddition(multip5, theResult);

      int multip6 [] =new int[8];
      multip6 [0&1&2&3&4]=0;
      for(int w=3; w<8; w++){
        multip6 [w]=n1[w-5]*n2[5];
      }
      theResult = onlyMulti.bAddition(multip6, theResult);

      int multip7 [] =new int[8];
      multip7 [0&1&2&3&4&5]=0;
      for(int v=3; v<8; v++){
        multip6 [v]=n1[v-6]*n2[6];
      }
      theResult = onlyMulti.bAddition(multip7, theResult);

      int multip8 [] =new int[8];
      multip8 [0&1&2&3&4&5&6]=0;
      for(int z=3; z<8; z++){
        multip6 [z]=n1[z-7]*n2[7];
      }
      theResult = onlyMulti.bAddition(multip8, theResult);
      return theResult;
  } //end of multiplication

//Divisionnn
  private static int [] bDivision(int [] n1, int [] n2, String num1, String num2){
    Binary8 onlyDivi = new Binary8();
    int theResult [] = new int [8];
    theResult = n1;
    int length = 0;
    while(length<=n1.length){
      if(Arrays.toString(theResult)==("[0, 0, 0, 0, 0, 0, 0, 0]")){
        length=9;
        break;}
      else {theResult = onlyDivi.bSubtraction(theResult,n2);
      //System.out.println (Arrays.toString(theResult));
      length++;}
    }
    return theResult;
  }

} //end of everything
