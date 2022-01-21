import java.util.*;

//call studentTest
/*
add class
delete class
edit class
*/
//ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

//----------------------------------
//add student, delete student, edit student


public class ClassTest {
    //stores/manages one class at a time
    // public static ArrayList<Class> classes = new ArrayList<>(); // move to Teacher class
    public static ArrayList<Class> classes = new ArrayList<Class>();

    public static void addClass() {
        boolean stop = false;
        int noOfStudents = 0;
        char level;

        //teacher input/assign Class level
        do {
            level = IBIO.inputChar("Level? ");
            level = Character.toUpperCase(level);
            if (level != 'S' || level != 'H') {
                System.out.print("Error - ");
            }
        } while (level != 'S' || level != 'H');

        //teacher inputs/assign grade for the class manually

        while (noOfStudents < 25 || stop) {
            int grade = IBIO.inputInt("Grade (11 or 12)? "); //grade is either 11 or 12
            while (grade < 11 || grade > 12) {
                grade = IBIO.inputInt("Please re-enter Grade (only 11 or 12): "); //grade is either 11 or 12
            }

            Class newClass = new Class(level, grade);
            int index = IBIO.inputInt("What is the index of this  class? (index<10): ");
            Student newStudent = new Student(level, grade, index);

            System.out.println(newStudent);

            newClass.students.add(newStudent);
            char more = IBIO.inputChar("add another student (y/n)? ");

            //newStudent is inside students' arraylist which is in the Class
            if (more == 'N' || more == 'n' || noOfStudents > 25)
                stop = true;
            while (noOfStudents < 25)
            {
                if (more == 'N' || more == 'n')
                    stop = true;
            }
        }
    }

    public static void editClass() {
        //call studentTest
        //create a new class
        //ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

        //Calls empty constructor of Class()
        // input class code
        // search class

        boolean stop = false;
        int noOfStudents = 0;
        while (noOfStudents < 25 || stop) {
            // teacher inputs student data + validate input
            char level;
            do {
                level = IBIO.inputChar("Level? ");
                level = Character.toUpperCase(level);
                if (level != 'S' || level != 'H') {
                    System.out.print("Error - ");
                }
            } while (level != 'S' || level != 'H');

            char more = IBIO.inputChar("add another student (y/n)? ");
            if (more == 'N' || more == 'n' || noOfStudents > 25)
                stop = true;
        }
    }

    public static void delete(){
        
    }

    public static void main(String[] args) {
        addClass();
    }

}

