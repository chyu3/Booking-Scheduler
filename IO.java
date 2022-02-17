//Duration is fixed

public class IO extends Appointment{
    public int Duration;

    //Student student;
    public IO(String ID,
              Date appointmentDate,
              Time appointmentTime) {
        super(ID, appointmentDate, appointmentTime);
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        duration = 20;
        this.Duration = duration;
    }

    /*public IO(Student student) {
        super(student);
    }*/
}
