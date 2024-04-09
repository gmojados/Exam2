package Exam2;

public class Manager extends Employee {
    private final double EXTRA_DISCOUNT = 0.5;
    private double salary;
    public Manager(double salary) {
        super(String.valueOf(salary));

    }
}
