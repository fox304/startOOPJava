package Seminar3.Task3;

public class Triangle extends Polygon {
    public int a;
    public   int b;
    public int c;

    public Triangle(int a, int b, int c) {
        super(new int[] {a,b,c});
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public String toString() {
//        return String.format("треугольник: \n\tплощадь: %s\n\tпериметр: %s",
//                getArea(),this.getPerimetr());
        return "треугольник: ";
    }


    @Override
    public double getArea() {
        double p = (a+b+c)*1.0/2;
        double p1 = p*(p-a)*(p-b)*(p-c);
        return  Math.sqrt(p1);

    }
}
