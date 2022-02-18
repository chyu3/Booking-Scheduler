import java.io.IOException;

public class mainMenu {

    public static void instructions(){
        System.out.println(
                "\n\tRules:\n" +
                        "\t! Make sure a class is created before creating a student \n" +
                        "\t! Date input must follow the format: DD/MM/YYYY \n" +
                        "\t! Time input must follow the format: 00:00 \n" +
                        "" +
                "\n\tInstructions:\n" +
                        "\tAt least one class have to exist, if a student want to be added to a class!" +
                        "\t"
        );
    }

    //Alternative method for return to menus
    public static void quit(boolean c){
        boolean C;
        C = c;
        C = true;
            if (C)
            {
                return;
            }
            else
                System.out.println("");
                System.exit(0);
    }

    public static void main(String[] args) throws Exception {
        boolean continues = true;
        //new switch case for teacher, student options
        System.out.println("\n\tWelcome to the Booking Scheduler!");

        do {
            System.out.println("\n\t           ~Main Menu~");
            System.out.println("\tStudent Menu    |    Teacher Menu");
            System.out.println("\t     ⬇                    ⬇    ");
            System.out.println("\t     S          |          T");
            System.out.println("\t__________________________________");
            System.out.println("\t         *Instructions*");
            System.out.println("\t                ⬇");
            System.out.println("\t                Q");

            char user = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            user = Character.toLowerCase(user);
            System.out.println();

            switch (user) {
                case 's':
                    StudentMenu.student();
                    break;

                case 't':
                    TeacherMenu.teacher();
                    break;

                case 'q':
                    instructions();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);
    }
}