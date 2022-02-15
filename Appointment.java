//has and stores Day - Time - (hour, minute and second)

public class Appointment extends StudentTest {
    Student student;
    public String ID;
    public int Date;
    public Date Time;
    public Time appointmentTime;
    private Date appointmentDate;

    public Appointment (Student student){
        this.student = student;
    }


    public void setAppointmentDate(Date appointmentDate){
        this.appointmentDate = appointmentDate;
    }
    public Date getAppointmentDate(){
        return appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
