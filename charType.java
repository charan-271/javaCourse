public class charType {
    public static void main(String[] args){
        // Char is a primitive datatype
        // Char represents a single character
        // We define char in java using single quote
        // char size is 2bytes or 16bits

        char myChar = 'A';
        System.out.println(myChar);
        char mychar2 = '1';
        System.out.println(mychar2);
        char mychar3 = '2';
        //char newchar = mychar2 + mychar3;
        //System.out.println(newchar);
        // this is not possible

        // for printing different characters we should use their respective unicode
        char myUnichar1 = '\u0190';
        System.out.println(myUnichar1);
        char myUnichar2 = '\u0130';
        System.out.println(myUnichar2);
    }
}
