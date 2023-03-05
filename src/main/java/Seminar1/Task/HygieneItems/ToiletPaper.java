package Seminar1.Task.HygieneItems;

public class ToiletPaper extends HygieneItems{
    private int layerCount;


    public ToiletPaper(String nameProduct,
                       int price,
                       int count,
                       String unitMeasure,
                       int countItems,
                       int layerCount) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                countItems);
        this.layerCount = layerCount;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" кол-во слоев %s",layerCount);
    }
}
