package Exam2;

public class Cloth extends Customer {
    private String name;;
    private double price;
    private Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cloth (String name, double price, Size size){
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
