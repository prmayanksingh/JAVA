package ObjectOrientedProgramming.classes_and_objects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Mayank" , 123);
        s1.print();
        // s1.name = "Mayank";
        // s1.rollNumbesr = 123;
        // s1.setrollNumber(123);

        Student s2 = new Student("Yash", 121);
        s2.print();
        // System.out.println(s1.numStudents);
        // System.out.println(s2.numStudents);
        // System.out.println(Students.numStudents);
        System.out.println(Student.getNumStudents());
        // System.out.println(s2.getNumStudents());
        
        
        // s2.name = "Yash";
        // s2.rollNumber = 121;
        // s2.setrollNumber(121);

        // System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s1);
    }
}