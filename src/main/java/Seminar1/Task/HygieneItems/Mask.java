package Seminar1.Task.HygieneItems;

public class Mask extends HygieneItems{


    public Mask(String nameProduct,
                int price,
                int count,
                String unitMeasure,
                int countItems) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                countItems);
    }

    @Override
    public String toString() {
        return super.toString()+" ??? ";
    }
}
