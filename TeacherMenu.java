import java.io.IOException;

public class TeacherMenu {
    //AppointmentManager.add();
    //classTest.addClass();

    public static void teacher() throws Exception {
        boolean continues = true;
        do {
            main(null);
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();
            switch (decisions) {
                case 'c':
                    management();
                    break;
                case 'a':
                    add();
                    break;
                case 'd':
                    delete();
                    break;
                case 'v':
                    view();
                    break;

                case 'b':
                    continues = false;
                    System.out.println("returning to Main Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    mainMenu.main(null);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (continues);
    }

    public static void managementTable(){
        System.out.println("+---==-******************-==---+");
        System.out.println("|      *  " + "Management" + "  *        |");
        System.out.println("|_____________________________________");
        System.out.println("|\tedit a class  |  edit a student |");
        System.out.println("|        ⬇                ⬇        ");
        System.out.println("|        C                 s        ");
        System.out.println("|_____________________________________");
        System.out.println("|\tReturn to Teacher Menu ");
        System.out.println("|            ⬇");
        System.out.println("|            B ");
    }

    public static void management() throws Exception {
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
            managementTable();
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();

            switch (decisions) {
                case 'c':
                    ClassTest.editClass();
                    break;
                case 's':
                    level = IBIO.inputChar("HL or SL or Pre-IB (Enter h, s or p): ");
                    grade = IBIO.inputInt("Grade? (11 or 12): ");
                    index = IBIO.inputInt("class number? < 10: ");
                    StudentTest.editStudent(level, grade, index);
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

    public static void addTable(){
        System.out.println("+\t--------------------------==-******************-==--------------------------------+");
        System.out.println("|\t                                *  " + "Add" + "  *                                    ");
        System.out.println("|\t___________________________________________________________________________________");
        System.out.println("|\tCreate class  |  Create student  |  New General appointment | New Oral appointment");
        System.out.println("|\t      ⬇               ⬇                       ⬇                       ⬇");
        System.out.println("|\t      C                W                       E                        R");
        System.out.println("|\t___________________________________________________________________________________");
        System.out.println("|\t                        Return to Teacher Menu ");
        System.out.println("|\t                                   ⬇");
        System.out.println("|\t                                   B ");
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
            addTable();
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
        System.out.println("|\t                       *  " + "Delete" + "  *                ");
        System.out.println("|\t__________________________________________________________________________________");
        System.out.println("|\tdelete student from a class | delete General Appointment | delete Oral Appointment");
        System.out.println("|\t             ⬇                          ⬇                          ⬇ ");
        System.out.println("|\t             Q                           W                          E ");
        System.out.println("|\t__________________________________________________________________________________");
        System.out.println("|\t                            Return to Teacher Menu ");
        System.out.println("|\t                                        ⬇");
        System.out.println("|\t                                        B ");
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
            deleteTable();
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

    public static void viewTable(){
        System.out.println("+\t---------------==-******************-==----------------+");
        System.out.println("|\t                    *  " + "View" + "  *                ");
        System.out.println("|\t____________________________________________________");
        System.out.println("|\tView general appointments  |  View oral appointments");
        System.out.println("|\t           ⬇                            ⬇    ");
        System.out.println("|\t           Q                             W    ");
        System.out.println("|\t=============================================================================================================");
        System.out.println("|\tList All students | List Students by Level | List students by Grade | List students in a Class by class code");
        System.out.println("|\t         ⬇                    ⬇                          ⬇                       ⬇");
        System.out.println("|\t         A                     S                          D                        F");
        System.out.println("|\t_______________________________________________________");
        System.out.println("|\t                   List All classes ");
        System.out.println("|\t                          ⬇      ");
        System.out.println("|\t                          Z     ");
        System.out.println("|\t_______________________________________________________");
        System.out.println("|\t                Return to Teacher Menu ");
        System.out.println("|\t                           ⬇");
        System.out.println("|\t                           B ");
    }

    public static void view(){
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
            viewTable();
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();

            switch (decisions) {
                case 'q':
                    AppointmentManager.listAppointments();
                    break;
                case 'w':
                    IOManager.listIOs();
                    break;

                case 'a':
                    StudentTest.listAllStudents();
                    break;
                case 's':
                    level = IBIO.inputChar("\tlevel? (H, S or P): ");
                    StudentTest.listStudentsByLevel(level);
                    break;
                case 'd':
                    grade = IBIO.inputInt("\tGrade? (11 or 12): ");
                    StudentTest.listStudentsByGrade(grade);
                    break;
                case 'f':
                    index = IBIO.inputInt("\tclass number? < 10: ");
                    StudentTest.listStudentsByIndex(index);
                    break;
                case 'z':
                    ClassTest.listAllClasses();
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

    public static void main(String[] args) {
        //continue from main menu
        System.out.println("+-------------==-******************-==--------------+");
        System.out.println("|\t             *  " + "Teacher Menu" + "  *                ");
        System.out.println("|___________________________________________________|");
        System.out.println("|\t    Management  |  Add  |  Delete  |  View");
        System.out.println("|           ⬇          ⬇        ⬇        ⬇");
        System.out.println("|           C           A        D         V ");
        System.out.println("|___________________________________________________|");
        System.out.println("|\t             Return to Main Menu                    ");
        System.out.println("|                        ⬇                             ");
        System.out.println("|                        B                             ");

    }
}
