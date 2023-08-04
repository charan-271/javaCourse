/*Declare a double variable weightKgs and take input from the user in kilograms. 
Also, Create a method convert(double kgs) and convert the weight to grams and milligrams. */
import java.util.Scanner;

public class weightconverter {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kilograms : ");
        double weightinkgs = sc.nextDouble();
        converter(weightinkgs);
    }

    public static void converter(double kgs){
        double weightingms, weightinmgs;
        weightingms = kgs * 1000;
        weightinmgs = weightingms * 1000;
        System.out.println("The converted weight in grams is :  " + weightingms);
        System.out.println("The converted weight in milligrams is :  " + weightinmgs);

    }
}
