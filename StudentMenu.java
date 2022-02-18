import java.io.IOException;

public class StudentMenu {
    public static void student() throws Exception {
        boolean continues = true;
        char level;
        int grade;
        int index;
        String classCode;  //H112
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;
        do{
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
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
                    date = IBIO.input("\nEnter the date (DD/MM/YYYY): ");
                    time = IBIO.input("\nPlease input the Starting time: ");
                    AppointmentManager.add(studentCode, new Date(date), new Time(time));
                    ClassTest.confirm();
                    if (ClassTest.confirm() == true) {
                        AppointmentManager.listAppointments();
                    } else return;
                    break;

                case 'B':
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
    
    public static void addTable(){
        System.out.println("+\t--------------------------==-******************-==--------------------------------+");
        System.out.println("|\t                            *  " + "Add" + "  *                                    ");
        System.out.println("|\t___________________________________________________________________________________");
        System.out.println("|\tCreate class  |  Create student  |  New General appointment | New Oral appointment");
        System.out.println("|\t      ⬇               ⬇                       ⬇                       ⬇");
        System.out.println("|\t      C                W                       E                        R");
        System.out.println("|\t___________________________________________________________________________________");
        System.out.println("|\t                        Return to previous step ");
        System.out.println("|\t                                    ⬇");
        System.out.println("|\t                                    B ");
    }

    public static void add() throws IOException {
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
                case 'w':
                    StudentTest.newStudent();
                    break;
                case 'e':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    StudentTest.check(studentCode);
                    date = IBIO.input("\nEnter the date (DD/MM/YYYY): ");
                    time = IBIO.input("Please input the starting time: ");
                    AppointmentManager.add(studentCode, new Date(date), new Time(time));
                    break;
                case 'r':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    StudentTest.check(studentCode);
                    IOManager.add(studentCode);
                    break;
                case 'b':
                    continues = false;
                    System.out.println("returning to Teacher Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    TeacherMenu.main(null);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);
    }

    public static void deleteTable(){
        System.out.println("+\t-----------------==-******************-==------------------+");
        System.out.println("|\t                    *  " + "Delete" + "  *                ");
        System.out.println("|\t__________________________________________________________________________________");
        System.out.println("|\tdelete student from a class | delete General Appointment | delete Oral Appointment");
        System.out.println("|\t             ⬇                          ⬇                          ⬇ ");
        System.out.println("|\t             Q                           W                          E ");
        System.out.println("|\t__________________________________________________________________________________");
        System.out.println("|\t                  Return to previous step ");
        System.out.println("|\t                             ⬇");
        System.out.println("|\t                             B ");
    }

    public static void delete() throws IOException {
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
                case 'q':
                    classIndex = IBIO.inputInt("Class Index? (1 to 10): ");
                    studentIndex = IBIO.inputInt("Student Number? (11 or 12): ");
                    ClassTest.confirm();
                    ClassTest.removeStudent(classIndex, studentIndex);
                    break;
                case 'w':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    ClassTest.confirm();
                    StudentTest.check(studentCode);
                    AppointmentManager.delete(studentCode);
                    break;
                case 'e':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    ClassTest.confirm();
                    StudentTest.check(studentCode);
                    IOManager.delete(studentCode);
                    break;
                case 'b':
                    continues = false;
                    System.out.println("returning to Student Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    StudentMenu.main(null);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);

    }

    public static void main(String[] args) {
        System.out.println("+---------------******************----------------+");
        System.out.println("|               *  " + "Student Menu" + "  *                |");

        System.out.println("|  New Oral appointment | New General appointment |");
        System.out.println("|            ⬇                    ⬇              |");
        System.out.println("|            C                     S              |");
        System.out.println("|_________________________________________________|");
        System.out.println("|               Return to previous step ");
        System.out.println("|                          ⬇");
        System.out.println("|                          B ");

    }
}
