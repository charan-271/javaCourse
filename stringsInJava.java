public class stringsInJava {
    public static void main(String[] args){
        /*String is a special datatype in java which is used to define a sequence of characters
         * having a storage width equal to 2.14 billion*/

        // Strings are immutable

        String myname = "my name is charan";
        String myage = "my age is 20 years";
        String myPlace = "Iam from India";
        System.out.println(myname);
        System.out.println(myage);
        System.out.println(myPlace);

        String myInfo = myname + myage + myPlace;
        System.out.println(myInfo);
        System.out.println(myname + " " + myage + " " + myPlace);

        myname = myage + myname;
        System.out.println(myname);

        int myInt = 100;
        myage = myage + myInt;
        System.out.println(myage);

        String myInt1 = "100";
        String myInt2 = "200";
        int myInt3 = 300;
        double myDouble = 543.1234;
        System.out.println(myInt1 + myInt2 + myInt3 + myDouble);
    }
}
