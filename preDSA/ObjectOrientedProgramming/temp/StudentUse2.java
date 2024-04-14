package ObjectOrientedProgramming.temp;

import ObjectOrientedProgramming.classes_and_objects.Student;

public class StudentUse2 {
    public static void main(String[] args) {
        Student s3 = new Student("jessi", 123);
        s3.name = "jessi";
        // s3.setrollNumber(123);
        s3.print();
    }
}