package Exam2;

public abstract class Customer extends Person {

    Cloth[] clothingItems;


    public Customer(Size size, Cloth cloth, int price){
        super(size, cloth, price);
    }



    public void printPriceAfterDiscount(Cloth cloth) {

    }
}
