public class ifElseStatement {
    public static void main(String[] args){
        // 100 - s
        // 91 to 99 -A
        // 81 to 90 -B
        // anything below that is fail

        int studentScore = 69;

        if (studentScore == 100){
            System.out.println("You scored S grade");
        } else if (studentScore > 90 && studentScore < 100) {
            System.out.println("you scored A grade");
        } else if (studentScore > 80 && studentScore < 91) {
            System.out.println("you scored B grade");
        }else{
            System.out.println("you failed");
        }
    }
}
