package Seminar1.Task.Beveragise;


public class Limonade extends Beveragese {

    public Limonade(String nameProduct,
                    int price,
                    int count,
                    String unitMeasure,
                    float liters) {
        super(nameProduct,
                price,
                count,
                unitMeasure,
                liters);
    }

    @Override
    public String toString() {
        return super.toString()+ " пить охлажденным ";
    }
}
