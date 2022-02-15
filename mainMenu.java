import java.io.IOException;
import java.util.*;

public class mainMenu {
    public static void teacher() throws IOException {
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0

        char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform\n");
        decisions = Character.toLowerCase(decisions);
        switch (decisions) {
            case 'c':
                ClassTest.addClass();
                break;
            case 'e':
                ClassTest.editClass();
                break;
            case 'k':
                ClassTest.listClasses(null);
                break;
            case 'S':
                StudentTest.newStudent();
                break;
            case 'U':
                level = IBIO.inputChar("HL or SL or Pre-IB (Enter h, s or p): ");
                grade = IBIO.inputInt("Grade? (11 or 12): ");
                index = IBIO.inputInt("class number? < 10: ");
                StudentTest.editStudent(level, grade, index);
                break;
            case 'D':
                classIndex = IBIO.inputInt("Class Index? (1 to 10): ");
                studentIndex = IBIO.inputInt("Student Number? (11 or 12): ");

                ClassTest.removeStudent(classIndex, studentIndex);
                break;
            case 'X':
                studentCode = IBIO.input("Please enter a student ID: ");
                AppointmentManager.add(studentCode);
                break;
            case 'T':
                studentCode = IBIO.input("Please enter a student ID: ");
                AppointmentManager.delete(studentCode);
                break;

        }
    }

    public static void student() {
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform\n");
            decisions = Character.toUpperCase(decisions);
            StudentMenu.main(null);

            switch (decisions) {
                case 'C':
                    studentCode = IBIO.input("\nEnter a student ID: ");
                    IOManager.add(null);
                    break;
                case 'S':
                    studentCode = IBIO.input("\nEnter a student ID: ");
                    AppointmentManager.add(null);
                    break;
            }
    }


    public static void main(String[] args) throws IOException {
        boolean continues = true;
        //'if else' loop to distinguish teacher and student access to actions

        do {
            char user = IBIO.inputChar("Are you teacher or student (t/s): ");
            user = Character.toUpperCase(user);

            if(user == 's') {
                StudentMenu.main(null);
                student();
            }
            if (user == 't'){
                TeacherMenu.main(null);
                teacher();
            }
        } while (continues);
    }
}
