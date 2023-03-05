package Seminar1.Task.GoodsForChildren;

import Seminar1.Task.Products;

public class GoodsForChildren extends Products {
    private int minAge;
    private boolean hypoallergeneric;


    public GoodsForChildren(String nameProduct,
                            int price,
                            int count,
                            String unitMeasure,
                            int minAge,
                            boolean hypoallergeneric) {
        super(nameProduct,
                price,
                count,
                unitMeasure);
        this.minAge = minAge;
        this.hypoallergeneric = hypoallergeneric;
    }

    @Override
    public String toString() {
        return super.toString()+
                String.format(" минимальный возраст: %s, гипоаллергенность: %s",
                        minAge,hypoallergeneric);
    }
}
