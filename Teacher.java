import java.util.*;

public class Teacher {
    ArrayList<Class> Class = new ArrayList<>(); //for multiple teachers

    //number of classes the teacher has
    public int getClasses(){return Class.size();}

    public String toString() {
        return Class.toString();
    }
}
