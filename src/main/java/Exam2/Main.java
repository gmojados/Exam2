package Exam2;

public class Main {
    public static void main(String[] args) {
        Cloth[] arrayOfCloth;
        arrayOfCloth = new Cloth[3];
        arrayOfCloth[0] = new Cloth("Jeans", 20, Size.S);
        arrayOfCloth[1] = new Cloth("Shirt", 15, Size.M);
        arrayOfCloth[2] = new Cloth("Pants", 20, Size.XL);

        Student student = new Student(Size.L);
        student.printUniqueStudentID();
        Student student2 = new Student(Size.XL);
        student2.printUniqueStudentID();
        student.printUniqueStudentID();
        student2.printInfo();
        ShopApp customer = new ShopApp(Size.L);
        System.out.println(customer.isAFit(student,"Jeans"));

        Manager manager = new Manager(70000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(40,17);
        Business business = new Business("Target", 40, 12);

        Customer[] arrayOfCustomers;
        arrayOfCustomers = new Customer[3];
        arrayOfCustomers = new Customer
















}
}
