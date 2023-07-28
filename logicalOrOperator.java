public class logicalOrOperator {
    public static void main(String[] args){
        // Any one of the condition must be true for executing the statement
        int c = 90;
        int d = 100;
        if ((c == 90) || (d >100)){
            System.out.println("its all good");
        }
        // NOT operator means not true, opposite
        // since isitsunday is true, we used '!' operator, so we got this output
        boolean isitsunday = false;
        if (!isitsunday){
            System.out.println("it is not a sunday");
        }
    }
}
