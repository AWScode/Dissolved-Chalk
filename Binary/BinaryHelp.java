import java.util.*;

public class BinaryHelp {
      public static void main(String[] arg){
      Scanner in1= new Scanner(System.in);
      System.out.println("Please give the first binary number.(start with one)"); //ask for typing the first binary number for later calculation//
      String a = in1.nextLine(); //input of the string version of the first binary number//

      Scanner in2=new Scanner(System.in);
      System.out.println("Please give the second binary number.(start with one)"); //ask for typing the second binary number for later calculation//
      String b = in2.nextLine(); //input of the string version of the second binary number//

      Scanner in3=new Scanner(System.in);
      System.out.println("Please give one operator.(+,-,*,/)"); //ask for typing the second binary number for later calculation//
      String c = in3.nextLine(); //input of the string version of the second binary number//

      int numbera []=new int[8]; //the array for storing the input a in 8 digits
      for (int i=0; i<8; i++) {// for loop to store the first binary number from string to integer and reverse it.
        if(i<a.length()){
          int aa =a.length()-1;
          int numbera1 = Integer.parseInt(a.substring(aa-i,a.length()-i));
          numbera [i]= numbera1;
        }
        else{
          numbera[i]=0;// to make it becomes 8 digits
        }
      }

      int numberb [] =new int[8]; //the array for storing the input b in 8 digits
      for (int i=0; i<8; i++) {// for loop to store the second binary number from string to integer and reverse it.
        if(i<b.length()){
          int bb =b.length()-1;
          int numberb2 = Integer.parseInt(b.substring(bb-i,b.length()-i));
          numberb [i]= numberb2;
        }
        else{
          numberb[i]=0;// to make it becomes 8 digits
        }
      }

      int result []  =new int[8]; //the array for storing the result of calculation or the result in 8 digits
      //addition
      if (c.equals("+")){
        for(int i=0;i<8;i++){// for loop for adding numbers one by one
          while(numbera [i]==2){// because it is binary so 2 should be "10"&& it is for later addition
          numbera [i]=0;
          numbera [i+1]=numbera [i+1]+1;
          }
          if(numbera [i]==0||numberb [i]==0){// adding numbers
            result [i]=numbera [i]+numberb [i];
          }
          else{// if "1+1"
            result[i]=0;
            numbera [i+1]= numbera[i+1]+1;
          }
        }
      }
      //subtraction
      if(c.equals("-")){
        for(int i=0;i<8;i++){// for loop for subtracting numbers one by one
        while(numbera [i]==-1){// what if it become -1
        numbera [i]=1;
        numbera [i+1]=numbera [i+1]-1;
        }
        if((numbera [i]==0 && numberb [i]==0)||numbera [i]==1){// subtracting numbers
          result [i]=numbera [i]-numberb [i];
        }
        else{// for the situation of "0-1"
          result[i]=1;
          numbera [i+1]= numbera[i+1]-1;
        }
      }
    }
    //multiplication
  if(c.equals("*")){
      /* I use the logic of how we do the mutiplication by hand,
       so the first number times the second number digit by digit
       and then add them together.*/
          int timer1 [] =new int[8];// first digit of second number times the first number
          for(int z=0; z<8; z++){
            timer1 [z]=numbera[z]*numberb[0];
          }
          int timer2 [] =new int[8];// second digit of second number times the first number
          timer2 [0]=0;// because during the addition by hand it will move to left one digit
          for(int z=1; z<8; z++){
            timer2 [z]=numbera[z-1]*numberb[1];
          }

          for(int i=0;i<8;i++){// for loop for adding timer1 and timer2 together
            while(timer1 [i]==2){//change 2 to "10"
            timer1 [i]=0;
            timer1 [i+1]=timer1 [i+1]+1;
            }
            if(timer1 [i]==0||timer2 [i]==0){// adding
              result [i]=timer1 [i]+timer2 [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer1 [i+1]= timer1[i+1]+1;
            }
          }

          int timer3 [] =new int[8];// third digit of second number times the first number
          timer3 [0&1]=0;// because during the addition by hand it will move to left 2 digits
          for(int z=2; z<8; z++){
            timer3 [z]=numbera[z-2]*numberb[2];
          }
          for(int i=0;i<8;i++){// for loop for adding result and timer3 together
            while(timer3 [i]==2){//change 2 to "10"
            timer3 [i]=0;
            timer3 [i+1]=timer3 [i+1]+1;
            }
            if(timer3 [i]==0||result [i]==0){// adding
              result [i]=timer3 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer3 [i+1]= timer3[i+1]+1;
            }
          }

          int timer4 [] =new int[8];// 4th digit of second number times the first number
          timer4 [0&1&2]=0;// because during the addition by hand it will move to left 3 digits
          for(int z=3; z<8; z++){
            timer4 [z]=numbera[z-3]*numberb[3];
          }
          for(int i=0;i<8;i++){// for loop for adding result and timer4 together
            while(timer4 [i]==2){//change 2 to "10"
            timer4 [i]=0;
            timer4 [i+1]=timer4 [i+1]+1;
            }
            if(timer4 [i]==0||result [i]==0){// adding
              result [i]=timer4 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer4 [i+1]= timer4[i+1]+1;
            }
          }

          int timer5 [] =new int[8];// 5th digit of second number times the first number
          timer5 [0&1&2&3]=0;// because during the addition by hand it will move to left 4 digits
          for(int z=4; z<8; z++){
            timer5 [z]=numbera[z-4]*numberb[4];
          }

          for(int i=0;i<8;i++){// for loop for adding result and timer5 together
            while(timer5 [i]==2){//change 2 to "10"
            timer5 [i]=0;
            timer5 [i+1]=timer4 [i+1]+1;
            }
            if(timer5 [i]==0||result [i]==0){// adding
              result [i]=timer5 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer5 [i+1]= timer4[i+1]+1;
            }
          }

          int timer6 [] =new int[8];// 6th digit of second number times the first number
          timer6 [0&1&2&3&4]=0;// because during the addition by hand it will move to left 5 digits
          for(int z=5; z<8; z++){
            timer6 [z]=numbera[z-5]*numberb[5];
          }

          for(int i=0;i<8;i++){// for loop for adding result and timer6 together
            while(timer6 [i]==2){//change 2 to "10"
            timer6 [i]=0;
            timer6 [i+1]=timer6 [i+1]+1;
            }
            if(timer6 [i]==0||result [i]==0){// adding
              result [i]=timer6 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer6 [i+1]= timer6[i+1]+1;
            }
          }

          int timer7 [] =new int[8];// 7th digit of second number times the first number
          timer7 [0&1&2&3&4&5]=0;// because during the addition by hand it will move to left 6 digits
          for(int z=6; z<8; z++){
            timer7 [z]=numbera[z-6]*numberb[6];
          }

          for(int i=0;i<8;i++){// for loop for adding result and timer7 together
            while(timer7 [i]==2){//change 2 to "10"
            timer7 [i]=0;
            timer7 [i+1]=timer4 [i+1]+1;
            }
            if(timer7 [i]==0||result [i]==0){// adding
              result [i]=timer7 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer7 [i+1]= timer7[i+1]+1;
            }
          }
          int timer8 [] =new int[8];// 8th digit of second number times the first number
          timer8 [0&1&2&3&4&5&6]=0;// because during the addition by hand it will move to left 7 digits
          for(int z=7; z<8; z++){
            timer8 [z]=numbera[z-7]*numberb[7];
          }

          for(int i=0;i<8;i++){// for loop for adding result and timer8 together
            while(timer8 [i]==2){//change 2 to "10"
            timer8 [i]=0;
            timer8 [i+1]=timer8 [i+1]+1;
            }
            if(timer8 [i]==0||result [i]==0){// adding
              result [i]=timer8 [i]+result [i];
            }
            else{// for the situation "1+1"
              result[i]=0;
              timer8 [i+1]= timer8[i+1]+1;
            }
          }
    }
    //division
    if (c.equals("/")){

      int origina []=new int[a.length]; //have the first number in the same form as they type in
      for (int i=0; i<8; i++) {// for loop to store the first binary number from string to integer and reverse it.
          int aa =a.length()-1;
          int origina1 = Integer.parseInt(a.substring(aa-i,a.length()-i));
          origina [i]= origina1;
      }

      int originb []=new int[b.length]; //have the second number in the same form as they type in
      for (int i=0; i<8; i++) {// for loop to store the first binary number from string to integer and reverse it.
          int bb =b.length()-1;
          int originb1 = Integer.parseInt(a.substring(aa-i,a.length()-i));
          originb [i]= originb1;
      }

    }
        for(int i=0;i<result.length/2;i++){// reverse the array of result
            int temp = result [i];
            result[i] = result[result.length-1-i];
            result[result.length-1-i] = temp;
        }
      for(int i=0;i<8;i++){// print the array
        System.out.print(result[i]);
      }
    }

  }
