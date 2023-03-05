package Seminar1.Task.HygieneItems;

import Seminar1.Task.Products;

public class HygieneItems extends Products {
    private int countItems;

    public HygieneItems(String nameProduct,
                        int price,
                        int count,
                        String unitMeasure,
                        int countItems) {
        super(nameProduct,
                price,
                count,
                unitMeasure);
        this.countItems = countItems;

    }

    @Override
    public String toString() {
        return super.toString()+String.format(" кол-во гигиенических средств %s",countItems);
    }
}
