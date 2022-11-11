import java.util.Locale;

public class ClassCode {
    //ClassCode parameters
    private final char Level; //higher or lower (H or S or P)
    private final int Grade; // grade 11 = 1, grade 12 = 2
    private int Index; //class number
    private int Number; //student's number or counter

    public ClassCode(char level, int grade, int index) {
        this.Level = level;
        this.Grade = grade;
        this.Index = index;
    }

    // overloaded constructor
    public ClassCode(char level, int grade, int index, int number) {
        this.Level = level;
        this.Grade = grade;
        this.Index = index;
        this.Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public int getGrade() {
        return Grade;
    }

    public int getIndex() {
        return Index;
    }

    public char getLevel() {
        return Level;
    }

    @Override
    public String toString() {
        return Level + Grade + Index + String.format("%03d", Number);
    }

    // polymorphism
    //compare classCodes
    public boolean equals(ClassCode cc)
    {
        String c1 = this.toString().toUpperCase();
        String c2 = cc.toString().toUpperCase();
        return c1.equals(c2);

    }

    public boolean equals(String cc)
    {
        String c1 = this.toString().toUpperCase();
        String c2 = cc.toUpperCase();
        return c1.equals(c2);

    }


}

