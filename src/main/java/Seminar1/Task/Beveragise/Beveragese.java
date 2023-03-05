package Seminar1.Task.Beveragise;

import Seminar1.Task.Products;

public class Beveragese extends Products {
    private float liters;


    public Beveragese(String nameProduct,
                      int price,
                      int count,
                      String unitMeasure,
                      float liters) {
        super(nameProduct,
                price,
                count,
                unitMeasure);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(", объём: %s",liters);
    }
}
