public class operatorPrecedence {
    public static void main(String[] args){
        int length = 10;
        int breadth = 20;

        double perimeter = 2*(length + breadth);
        System.out.println("The perimeter of the rectangle is : " + perimeter);

        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
