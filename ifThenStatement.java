public class ifThenStatement {
    public static void main(String[] args){
        /*Conditional logic uses specific statements in java to allow us to check and condition and execute certain
         * code based on whether the condition is true or false*/

        /*if-Then statement is the most basic control flow-statement that tell our program to execute a code onl if a particular test is true*/
        boolean myAge18 = false;

        if(myAge18 == true){
            System.out.println("You are eligible to vote");
        }
        if(myAge18 == false){
            System.out.println("you are not eligible to vote");
        }
        int a = 10;
        if (a == 10){
            System.out.println("lmao");
            System.out.println("lol");
        }
        //when we use boolean,inside the if() it executes only if the boolean value is true
        boolean b = true;
        if (b){
            System.out.println("boolean test");
        }
        boolean c = false;
        if (c){
            System.out.println("when boolean is false");
        }
    }
}
