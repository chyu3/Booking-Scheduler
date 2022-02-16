import java.io.IOException;
import java.util.*;

public class mainMenu {

    public static void quit(){

    }

    public static void teacher() throws IOException {
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;

        char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform\n");
        decisions = Character.toLowerCase(decisions);
        System.out.println();
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
            case 's':
                StudentTest.newStudent();
                break;
            case 'u':
                level = IBIO.inputChar("HL or SL or Pre-IB (Enter h, s or p): ");
                grade = IBIO.inputInt("Grade? (11 or 12): ");
                index = IBIO.inputInt("class number? < 10: ");
                StudentTest.editStudent(level, grade, index);
                break;
            case 'd':
                classIndex = IBIO.inputInt("Class Index? (1 to 10): ");
                studentIndex = IBIO.inputInt("Student Number? (11 or 12): ");

                ClassTest.removeStudent(classIndex, studentIndex);
                break;
            case 'z':
                studentCode = IBIO.input("Please enter a student ID: ");
                StudentTest.check(studentCode);
                date = IBIO.input("\nEnter the date (DD/MM/YYYY):");
                time = IBIO.input("Please input the starting time;");
                AppointmentManager.add(studentCode, new Date(date), new Time(time));
                break;
            case 'o':
                studentCode = IBIO.input("Please enter a student ID: ");
                StudentTest.check(studentCode);
                AppointmentManager.delete(studentCode);
                break;
            case 'x':
                studentCode = IBIO.input("Please enter a student ID: ");
                StudentTest.check(studentCode);
                IOManager.add(studentCode);
                break;
            case 't':
                studentCode = IBIO.input("Please enter a student ID: ");
                StudentTest.check(studentCode);
                IOManager.delete(studentCode);
                break;
            default:
                System.out.println("Invalid Choice");
                break;

        }
    }

    public static void student() throws Exception{
        char level;
        int grade;
        int index;
        String classCode;  //H112
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;

        char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform\n");
            decisions = Character.toUpperCase(decisions);
            System.out.println();
            switch (decisions) {
                case 'C':
                    studentCode = IBIO.input("\nEnter a student ID: ");
                    StudentTest.check(studentCode);
                    IOManager.add(studentCode);
                    break;

                case 'S':
                    studentCode = IBIO.input("\nEnter a student ID: ");

                    StudentTest.check(studentCode);
                    date = IBIO.input("\nEnter the date (DD/MM/YYYY):");
                    time = IBIO.input("\n Enter the Starting time (");
                    AppointmentManager.add(studentCode, new Date(date), new Time(time));
                    ClassTest.confirm();
                    if(ClassTest.confirm() == true){
                        AppointmentManager.listAppointments();
                    } else return;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
    }


    public static void main(String[] args) throws Exception {
        boolean continues = true;
        //new switch case for teacher, student options
        System.out.println("Welcome to the Booking Scheduler!");

        do {
            char user = IBIO.inputChar("Are you teacher or student (t/s): ");
            user = Character.toUpperCase(user);
            System.out.println();

            switch (user) {
                case 'S':
                    StudentMenu.main(null);
                    student();
                    break;

                case 'T':
                    TeacherMenu.main(null);
                    teacher();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);
    }
}


//return to previous step?