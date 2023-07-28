public class ternaryOperators {
    public static void main(String[] args){
        boolean ismarch = true;
        boolean isnoofdays31 = ismarch ? true : false;
        System.out.println(isnoofdays31);//for testing
        // if ismarch is true, isnoofdays is also true. if ismarch is false, isnoofdays is also false
        if (isnoofdays31){
            System.out.println("Days are not 31");
        }

        int heightoftruck = 50;

        boolean truckallowed = heightoftruck == 50 ? true : false;
        if (truckallowed){
            System.out.println("you can cross the bridge");
        }
    }
}
