/*
Rachel Holland
10/20/17
Palindrome CS project
*/

import java.util.*;


public class Palindrome {

    public static boolean palindromeCheck(String test) {
      if(test.length()%2==0){
        int half = test.length()/2;
        String firstHalf = test.substring(0,half-1);
        String secondHalf = test.substring((half),(test.length()-1));
        String haha = new StringBuilder(secondHalf).reverse().toString();
        if(firstHalf.equals(haha))
          {return true;}
        else {return false;}
      }
      else{
        int half = test.length()/2;
        String firstHalf = test.substring(0,half-1);
        String secondHalf = test.substring((half),(test.length()-1));
        String haha = new StringBuilder(secondHalf).reverse().toString();
        if(firstHalf.equals(haha)){return true;}
        else {return false;}
    }
  }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {

            System.out.println("That's not a Palindrome!");
        }

    }

}
