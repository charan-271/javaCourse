// Write a method named hasNotTeen with 3 parameters of type int.
// We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen. 
// Given 3 int values, return true if none of them are teen, otherwise return false.

import java.util.Scanner;

public class teenNumberChecker{

    public boolean hasNotTeen (int num1, int num2, int num3){
        if(num1 >= 13 && num1 <= 19){
            return false;
        }else if(num2 >= 13 && num2 <= 19){
            return false;
        }else if(num3 >= 13 && num3 <= 19){
            return false
        }else{
            return true;
        }
    }

    public static void main(Strings[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean result = hasNotTeen(num1, num2, num3);
        System.out.println(result);
    }
}
