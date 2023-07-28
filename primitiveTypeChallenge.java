public class primitiveTypeChallenge {
    public static void main(String[] args){
        /*Declare three variables and initialise them with some valid values. One of type int, one
         * of type byte and one of type short.
         * Finally create a variable of type long which is equal to 1000 times the sum of the above three*/
        int var1 = 10;
        byte var2 = 15;
        short var3 = 5;

        long longSum = 1000 * (var1 + var2 + var3);
        System.out.println(longSum);

        short shortSum = (short) (1000 * (var1 + var2 + var3));
        System.out.println(shortSum);

    }
}
