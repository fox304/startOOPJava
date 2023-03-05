package Seminar1.Task;

public class Products {
    private String nameProduct;
    private int price;
    private int count;
    protected String unitMeasure;

    public Products(String nameProduct,
                    int price,
                    int count,
                    String unitMeasure) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.count = count;
        this.unitMeasure = unitMeasure;
    }

    @Override
    public String toString() {
        return String.format("название продукта: %s, " +
                " цена: %s, " +
                " кол-во %s, " +
                " единица измерения: %s ",
                nameProduct,price,count,unitMeasure);
    }

}
