package Seminar1.Task;

public class Products {
    private String nameProduct;
    private int price;
    private int count;
    private String unitMeasure;

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
        return String.format("название продукта: %s,\t" +
                " цена: %s,\t" +
                " кол-во %s,\t" +
                " единица измерения: %s",
                nameProduct,price,count,unitMeasure);
    }
}
