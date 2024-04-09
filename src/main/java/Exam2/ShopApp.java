package Exam2;

public class ShopApp extends Person {
    public ShopApp(Size size) {
        super(String.valueOf(size));
    }

    public boolean isAFit(Customer customer, String cloth){

        return true;
    }
    public double calculateSubTotal(Cloth[] arrayOfCloth){


        return arrayOfCloth.length;
    }
    public void printClassNamesOfPayableEntities(Payable[] payable){

    }
}
