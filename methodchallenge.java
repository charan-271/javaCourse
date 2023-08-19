/*Declare a string containing a student name, declare a integer variable containing marks
 * of a student between 0 to 100
 * 
 * create a method to calculate the grade of a student based on marks
 * 
 * Then finally create another method to display the student name and grade
 */

 public class methodchallenge{
    public static void main(String[] args){

        String studentName = "charan";
        int studentMarks = 87;
        char studentgrade = gradeCalculator(studentMarks);
        displaydetails(studentName, studentgrade);
    }
    public static char gradeCalculator (int marks){
        char grade;

        if (marks > 90 && marks <= 100){
            grade = 'S';
        }else if (marks > 80 && marks <= 90){
            grade = 'A';
        }else if (marks > 70 && marks <= 80){
            grade = 'B';
        }else {
            grade = 'F';
        }

        return grade;
    }

    public static void displaydetails(String Name, char StudentGrade){
        System.out.println("the student name is : " + Name + " " + "He scored a grade : " + StudentGrade);
    }
 }