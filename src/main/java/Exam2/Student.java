package Exam2;

public class Student extends Customer {
    public static long uniqueStudentID=0;
    public long studentId;
    private final double DISCOUNT = .05;
    public Student(Size size) {
        super(String.valueOf(size));
        uniqueStudentID++;
        studentId = uniqueStudentID;

    }

    public void printUniqueStudentID() {
        System.out.println(studentId);

    }


    @Override
    public void printInfo(){
        System.out.println("Student{" +
                "studentId=" + studentId +
                ", DISCOUNT=" + DISCOUNT +
                '}');

    }

}
