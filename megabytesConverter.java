/*Create a integer variable kiloBytes and take a input from the user in kiloBytes. 
Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.  

For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).  */

import java.util.Scanner;

public class megabytesConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kiloBytes :  ");
        int kiloBytes = sc.nextInt();
        printMegaBytes(kiloBytes);

    }

    public static void printMegaBytes(int kiloBytes){
        int Megabytes;
        Megabytes = kiloBytes / 1024;
        System.out.println("The converted data from kilobytes is " + Megabytes + " megabytes");
    }
}
