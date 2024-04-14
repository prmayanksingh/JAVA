package ObjectOrientedProgramming.classes_and_objects;

public class Student {
    public String name;
    //final data member can be initialized as soon as they are declared
    private final int rollNumber;
    private static int numStudents;

    // public Student (){
    //     rollNumber = 100;
    // }
    // public Student (String s){
    //     name = s;
    //     rollNumber = 100;
    // }

    public static int getNumStudents(){ // Static means it's same for everyone Like -> Number of students and non Static means it's different for everyone like -> Name and rollnumber:
        return numStudents;
    }

    public Student (String name, int rollNumber){
        // System.out.println(this); // this is the adderess of the student
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    // public void setrollNumber(int rn){
    //     if (rn <= 0){
    //         return;
    //     }
    //     rollNumber = rn;
    // }

    public int getrollNumber(){
        return rollNumber;
    }

    public void print(){
        System.out.println(name + " : " + rollNumber);
    }
}