package Seminar1.Task.FoodProducts;

public class Bread extends FoodProducts{
    private String flourType;


    public Bread(String nameProduct,
                 int price,
                 int count,
                 String unitMeasure,
                 String expirationDate,
                 String flourType) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                expirationDate);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" сорт муки: %s",flourType);
    }
}
