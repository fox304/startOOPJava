package Seminar1.Task.GoodsForChildren;

public class Diapers extends GoodsForChildren{
    private int diapersCount;
    private float weiteMin;
    private float weiteMax;
    private String diapersType;


    public Diapers(String nameProduct,
                   int price,
                   int count,
                   String unitMeasure,
                   int minAge,
                   boolean hypoallergeneric,
                   int diapersCount,
                   float weiteMin,
                   float weiteMax,
                   String diapersType) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                minAge,
                hypoallergeneric);
        this.diapersCount = diapersCount;
        this.weiteMin = weiteMin;
        this.weiteMax = weiteMax;
        this.diapersType = diapersType;
    }

    @Override
    public String toString() {
        return super.toString()+
                String.format(" кол-во подгузников: %s, мин вес: %s, макс вес: %s, вид: %s",
                        diapersCount,weiteMin,weiteMax,diapersType);
    }
}
