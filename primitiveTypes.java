public class primitiveTypes {
    public static void main(String[] args){
        //int value1 = 100000000000000000000000000;
        //System.out.println(value1);
        /*Here it will show integer number too large coz int datatype has a minimum value
        of -2^31 and a maximum value of (2^31)-1*/
        int minRange = Integer.MIN_VALUE;
        int maxRange = Integer.MAX_VALUE;
        System.out.println(minRange);//-2147483648
        System.out.println(maxRange);//2147483647

        //Testing max and min ranges
        int sum2 = maxRange + 1;
        int sum1 = minRange - 1;
        System.out.println(sum1);
        System.out.println(sum2);
        /*Here overflow happens when max range +1 and it will display the min range
         * and underflow happens when min range -1 and it will display the max range*/

        //Byte max and min ranges
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Byte max value is : " + maxValue);
        System.out.println("Byte min value is : " + minValue);
        //Byte is the rarest used datatype in java
        //Byte size is very less compared to integer


        //Short max and min ranges
        short maxVal = Short.MAX_VALUE;
        short minval = Short.MIN_VALUE;
        System.out.println("Short max value is : " + maxVal);
        System.out.println("Short min value is : " + minval);

        //Long max and min ranges
        long maxVal1 = Long.MAX_VALUE;
        long minVal1 = Long.MIN_VALUE;
        System.out.println("long max value is : " + maxVal1);
        System.out.println("long min value is : " + minVal1);
        //Long max&min values are huge compared to integer values
        //We should put "L" at the end of the number when assigning to long
    }
}
