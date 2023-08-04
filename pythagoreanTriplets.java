/*Write a program to accept three number and check whether they are pythagorean triplet or not*/
//Pythagorean triplets are a2+b2 = c2 where a, b and c are the three positive integers.

import java.util.Scanner;

public class pythagoreanTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculatePythagoreanTriplets(a, b, c);
    }

    public static void calculatePythagoreanTriplets(int a, int b, int c){
        int p = a * a;
        int q = b * b;
        int r = c * c;

        if(p + q == r){
            System.out.println(a + " " + b + " and " + c + " are pythagorean triplets");
        }else{
            System.out.println(a + " " + b + " and " + c + " are not pythagorean triplets");
        }
    }
}
