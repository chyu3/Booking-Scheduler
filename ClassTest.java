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
        //ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?
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

    public static void delete(String classCode)
    {
        for (int i = 0; i < classes.size(); i++)
        {
            Class currentClass = classes.get(i);
            String currentClassCode = currentClass.getClassCode();
            if(currentClassCode.equals(classCode))
            {
                System.out.println("Searching success! Continue to delete " + currentClassCode);
                if(confirm() == true)
                {

                }
            }
        }
    }

    public static boolean confirm(){
        char temp = ' ';
        String answer = IBIO.input("Are you sure (Y/N)? ");
        answer = answer.toLowerCase();
        if (answer.length() > 0)
        {
            temp = answer.charAt(0);
        }
        while (answer.length() < 1 || (temp != 'y' && temp != 'n'))
        {
            answer = IBIO.input("Please answer Y or N / y or n: ");
            answer = answer.toLowerCase();
            System.out.println(answer.length());
            if (answer.length() > 0)
            {
                temp = answer.charAt(0);
            }
        }
        return (temp == 'y');
    }

    public static void load(){

    }

    public static void listClasses(){
        String currentClass;
        for (Class A: classes ){
            
        }
    }

    public static void main(String[] args) {
        addClass();
    }

}

