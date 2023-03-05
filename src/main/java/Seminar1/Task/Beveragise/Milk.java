package Seminar1.Task.Beveragise;

import Seminar1.Task.Beveragise.Beveragese;

public class Milk extends Beveragese {
    private float percentFat;



    public Milk(String nameProduct,
                int price,
                int count,
                String unitMeasure,
                float liters,
                float percentFat) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                liters);
        this.percentFat = percentFat;

    }

    @Override
    public String toString() {
        return super.toString()+String.format(" жирность: %s",percentFat);
    }
}
