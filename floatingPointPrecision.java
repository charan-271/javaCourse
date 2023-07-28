public class floatingPointPrecision {
    public static void main(String[] args){
        int intvalue = 22/7;
        float floatvalue = 22f/7f;
        double doublevalue = 22d/7d;
        System.out.println("int value: " + intvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);

        // when we are looking for precise values, we must use "f" , "d" , otherwise we will not get any precise values
        // we will only get nearest rounded integers :(
    }
}
