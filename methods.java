public class methods {
    public static void main(String[] args){
        /*Method is a block of code or collection of statements or a set of code grouped together to perform
        * a certain task or operation*/
        mydetails();
        System.out.println("this is test");

        perimeterofrect(10,20);
        perimeterofrect(20,30);
        speedofobject(10,20);

        double topspeed = speedofobject(100, 20);

        double x = 40 * topspeed;
        System.out.println(x);

    }
    public static void mydetails(){
        String myName = "my name is charan";
        int age = 20;
        double height = 5.9;
        System.out.println(myName);
        System.out.println(age);
        System.out.println(height);
    }

    public static void perimeterofrect(int length, int breadth){
        double perimeter = 2*(length + breadth);
        System.out.println("The perimeter is : " + perimeter);
    }

    public static double speedofobject (double distance, double time){
        double speed = distance / time;
        return speed;
    }
}
