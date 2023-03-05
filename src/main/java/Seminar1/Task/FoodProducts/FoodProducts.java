package Seminar1.Task.FoodProducts;

import Seminar1.Task.Products;

public class FoodProducts extends Products {
    private String expirationDate;

    public FoodProducts(String nameProduct,
                        int price,
                        int count,
                        String unitMeasure,
                        String expirationDate) {
        super(nameProduct,
                price,
                count,
                unitMeasure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" срок годности: %s",expirationDate);
    }
}
