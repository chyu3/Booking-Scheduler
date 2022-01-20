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

    public static void addClass(){
        //Calls empty constructor of Class()
        Class newClass = new Class();
        boolean stop = false;
        int noOfStudents = 0;
        char level;

        do
        {
            level = IBIO.inputChar("Level? ");
            level = Character.toUpperCase(level);
            if (level != 'S' || level != 'H')
            {
                System.out.print("Error - ");
            }
        } while (level != 'S' || level != 'H');

        //teacher inputs/assign grade for the class manually
        int grade = IBIO.inputInt("Grade (11 or 12)? "); //grade is either 11 or 12
        while(grade < 11 || grade > 12)
        {
            grade = IBIO.inputInt("Please re-enter Grade (only 11 or 12): "); //grade is either 11 or 12
        }
        while (noOfStudents < 25 || stop)
        {
            //newStudent is inside students' arraylist which is in the Class
            newClass.students.add(newStudent);
            char more = IBIO.inputChar("add another student (y/n)? ");
            while (noOfStudents < 25) {
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

    public static void main(String[] args) {
        addClass();
    }

}

