import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class AppointmentManager {
    boolean Continue = true;

    public static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    //add a general appointment
    public static void add(String ID, Date date, Time time){
        //Date object = new Date(date);
        //date.getDay();
        Appointment  appt = new Appointment(ID, date, time);
        appointments.add(appt);
        ClassTest.confirm();
        listAppointments();
    }


    public static void delete (String ID){

        for (int i = 0; i < appointments.size(); i++)
        {
            Appointment currentAppointment = appointments.get(i); //get appointment index from the arraylist
            String currentAppointmentNumber = currentAppointment.ID;
            if(currentAppointmentNumber.equals(ID))
            {
                System.out.println("Searching success! Continue to delete " + ID);
                ClassTest.confirm();
                if(ClassTest.confirm() == true)
                {

                }
            }
        }
    }

    //save appointments tp a file
    public static void save() throws IOException {
        System.out.println("<<< Saving data >>>");
        File studentFile = new File("students.txt");
        FileWriter fw = new FileWriter(studentFile);
        PrintWriter out = new PrintWriter(fw);
        for (Appointment s : appointments)  //load and save each object from appointments arraylist to a csv file
        {
            out.println(s.getAppointmentDate());
            out.println(s.getAppointmentTime());
        }
        out.close();
        System.out.println("Data file saved.");
    }

    public static void listAppointments(){

        for (Appointment s : appointments)
        {
            System.out.println(s + "\n");
        }

        /*boolean a = true;
        do{
            for (int i = 0; i < appointments.size(); i++){
                return appointments.get(i);
            }
        } while (a = true);
        return null;

        */
    }

    public static void main(String[] args) {
        //2D array (prints scheduler) : after ID and time assigned

    }

}
