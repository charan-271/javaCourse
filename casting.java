public class casting {
    public static void main(String[] args){
        /*Converting a number from one datatype to a different datatype is called casting*/
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;

        byte newValue = maxValue;
        System.out.println(newValue);
        /*byte newValue1 = maxValue/2
         * if we used this the compiler will throw error coz we used an int to divide a byte
         * so we should convert the int to byte*/
        byte newValue1 = (byte) (maxValue/2);
        System.out.println(newValue1);

        short Value = 32761;
        short newValue2 = (short) (Value/2);
        System.out.println(newValue2);
    }
}
