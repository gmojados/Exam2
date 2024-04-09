package Exam2;

public abstract class Employee extends Customer implements Payable {
    protected final double DISCOUNT = .10;


    public Employee(String size) {

        super(size);
    }


    }

