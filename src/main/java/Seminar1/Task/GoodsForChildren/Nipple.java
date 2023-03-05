package Seminar1.Task.GoodsForChildren;

public class Nipple extends GoodsForChildren{
    public Nipple(String nameProduct,
                  int price,
                  int count,
                  String unitMeasure,
                  int minAge,
                  boolean hypoallergeneric) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                minAge,
                hypoallergeneric);
    }

    @Override
    public String toString() {
        return super.toString()+" силиконовая ";
    }
}
