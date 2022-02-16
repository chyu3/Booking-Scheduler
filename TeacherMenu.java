import java.io.IOException;

public class TeacherMenu {
    //AppointmentManager.add();
    //classTest.addClass();

    public static void teacher() throws Exception {
        boolean continues = true;
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;

        do {
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();
            switch (decisions) {
                case 'c':
                    ClassTest.createClass();
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
                    date = IBIO.input("\nEnter the date (DD/MM/YYYY): ");
                    time = IBIO.input("Please input the starting time: ");
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
                case '1':
                    StudentTest.listAllStudents();
                    break;
                case '2':

                case 'b':
                    continues = false;
                    System.out.println("returning to Main Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    mainMenu.main(null);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (continues);
    }

    public static void main(String[] args) {
        //continue from main menu
        boolean continues = true;

        System.out.println("+---------------==-******************-==----------------+");
        System.out.println("|               *  " + "Teacher Menu" + "  *                |");
        System.out.println("|_______________________________________________________");
        System.out.println("|\tCreate class  |  edit class  |  view class");
        System.out.println("|        ⬇              ⬇              ⬇");
        System.out.println("|        C               E              K ");
        System.out.println("|_______________________________________________________");
        System.out.println("|\tCreate student | edit student | delete student ");
        System.out.println("|         ⬇             ⬇              ⬇");
        System.out.println("|         S              U              D ");
        System.out.println("|_______________________________________________________");
        System.out.println("|\tNew Oral appointment | Delete Oral appointment ");
        System.out.println("|              ⬇                     ⬇");
        System.out.println("|              X                      T ");
        System.out.println("|_______________________________________________________");
        System.out.println("|\tNew General appointment | Delete General appointment ");
        System.out.println("|              ⬇                         ⬇");
        System.out.println("|              Z                          O ");
        System.out.println("|================================================================================================");
        System.out.println("|\tList All students | List Students by Level | List students by Grade | List students in a Class");
        System.out.println("|         ⬇                    ⬇                          ⬇                       ⬇");
        System.out.println("|         1                     2                          3                        4");
        System.out.println("|_______________________________________________________");
        System.out.println("|\tList All classes | List One class ");
        System.out.println("|         ⬇                 ⬇");
        System.out.println("|         5                  6 ");
        System.out.println("|_______________________________________________________");
        System.out.println("|                Return to previous step ");
        System.out.println("|                            ⬇");
        System.out.println("|                            B ");





    }
}
