package Exam2;

public class Business implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;
    public Business (String name, int qtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = qtySupplied;
        this.productPrice = productPrice;
    }

}
