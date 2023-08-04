/*Declare a string variable student_name and a int variable student_score. calculate student division by using student_score variable.

Student division can be calculated as :

if student_score>=80, print "A" division

else if student_score >=60 and <80, print "B" division

else if student_score>=40 and <60, print "C" division

else if student_score<40, print "F" division. */
public class methodchallenge2 {
    public static void main(String[] args){
        
        String student_name = "Charan";
        int student_score = 85;
        char student_division = studentgrade(student_score);
        studentdetails(student_name, student_division);
    }
    
    public static char studentgrade(int score){
        char division;

        if(score >= 80){
            division = 'A';
        }else if(score >= 60 && score <= 80){
            division = 'B';
        }else if(score >= 40 && score <60){
            division = 'C';
        }else{
            division = 'F';
        }
        
        return division;
    }

    public static void studentdetails(String name, char grade){
        System.out.println("The student name is : " + name + "The student division is : " + grade);
    }
}
