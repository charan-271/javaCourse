public class floatingPointChallenge {
    public static void main(String[] args){
        /* Calculate the quantity of petrol and diesel in a budget of 1546.12 Rs according to respective prices 84.11 , 74.91*/

        double petrolprice = 84.11;
        double dieselprice = 74.91;
        double budget = 1546.12;

        double petrolquantity = budget/petrolprice;
        double dieselquantity = budget/dieselprice;

        System.out.println("Quantity of petrol is: " + petrolquantity);
        System.out.println("Quantity of diesel is: " + dieselquantity);
    }
}
