import java.util.*;

//call studentTest
/*
add class
delete class
edit class
*/
//ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

//----------------------------------
//stores/manages one class at a time

public class ClassTest {
    //Array List of all classes
    public static ArrayList<Class> classes = new ArrayList<Class>();

    public static void createClass() {
        int noOfStudents = 0;
        char level;

        //teacher input/assign Class level manually
        //teacher inputs/assign grade of the class manually
        while (noOfStudents < 25) {
            do {
                level = IBIO.inputChar("\nLevel? (H or S or P) : ");
                level = Character.toLowerCase(level);
                System.out.println();

                if (level != 's' && level != 'h' && level!= 'p') {
                    System.out.print("Error - ");
                }
            } while (level != 's' && level != 'h' && level!= 'p');

            int grade = IBIO.inputInt("Grade (11 or 12)? "); //grade is either 11 or 12
            while (grade < 11 || grade > 12) {
                grade = IBIO.inputInt("Please re-enter Grade (only 11 or 12): "); //grade is either 11 or 12
            }

            Class newClass = new Class(level, grade);
            int index = IBIO.inputInt("What is the index of this  class? (index<10): ");
            Student newStudent = new Student(level, grade, index);

            newClass.students.add(newStudent);
            noOfStudents++;
            System.out.println(newStudent + " added");

            char more = IBIO.inputChar("add another student (y/n)? ");

            //newStudent is inside students' arraylist which is in the Class
            if (more == 'N' || more == 'n' || noOfStudents > 25)
            {
                break;
            }
            classes.add(newClass);
            System.out.println("Class added:\n" + newClass.toString());
            /*while (noOfStudents < 25) {
                if (more == 'N' || more == 'n')
                    stop = true;
            }*/
        }
    }

    // THIS ISN'T DOING ANYTHING, SAFE TO REMOVE, teacher can use delete and add student instead
    public static void editClass() {
        //ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?
        // input class code
        // search class

        boolean stop = false;
        int noOfStudents = 0;
        while (!stop || noOfStudents < 25) {
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
            {
                stop = true;

            }
        }
    }


    public static boolean confirm() {
        char temp = ' ';
        String answer = IBIO.input("Are you sure (Y/N)? ");
        answer = answer.toLowerCase();
        if (answer.length() > 0) {
            temp = answer.charAt(0);
        }
        while (answer.length() < 1 || (temp != 'y' && temp != 'n')) {
            answer = IBIO.input("Please answer Y or N / y or n: ");
            answer = answer.toLowerCase();
            System.out.println(answer.length());
            if (answer.length() > 0) {
                temp = answer.charAt(0);
            }
        }
        return (temp == 'y');
    }

    //empty all objects in a class by the given class code
    public static void emptyClass(ClassCode classCode)
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
                    classes.remove(classCode);
                }
            }
        }
    }

    public static int findClass(String classCode) {
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).getClassCode().equalsIgnoreCase(classCode))
                return i;
        }
        return -1;
    }

    public static int findStudent(int classIndex, String studentCode) {
        for (int i = 0; i < classes.get(classIndex).students.size(); i++) {
            if (classes.get(classIndex).students.get(i).getID().toString().equalsIgnoreCase(studentCode))
                return i;
        }
        return -1;
    }

    //removes student from one class, but the student object stays in the students list
    public static void removeStudent(int classIndex, int studentIndex) {
        System.out.println("Removing " + classes.get(classIndex).students.get(studentIndex).getID() + "from " +
                classes.get(classIndex).getClassCode());
        System.out.print("Are you really sure? ");
        if (confirm() == true) {
            classes.get(classIndex).students.remove(studentIndex);
            System.out.println("removed student from " + classes.get(classIndex).getClassCode());
        } else
            System.out.println("Removal cancelled.");
    }

    //input ClassCode = level + grade  e.g. Classes that are Higher level and grade 12  would be H12
    public static void listClasses(String ClassCode) {
        String currentClass;
        for (Class A : classes) {
            currentClass = A.getClassCode();
            if (currentClass.startsWith(ClassCode)) {
                System.out.println(A);
            }
        }
    }



    public static void main(String[] args) {
        createClass();
    }

}

