package Seminar1.Task.FoodProducts;

public class Eggs extends FoodProducts{
    private int quantityInPackage;

    public Eggs(String nameProduct,
                int price,
                int count,
                String unitMeasure,
                String expirationDate,
                int quantityInPackage) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                expirationDate);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" кол-во яиц в %s %s штук",unitMeasure,quantityInPackage);
    }
}
