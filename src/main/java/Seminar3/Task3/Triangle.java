package Seminar3.Task3;

public class Triangle extends Polygon {
    private int a;
    private    int b;
    private int c;

    public Triangle(int a, int b, int c) {
        super(new int[] {a,b,c});
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public String toString() {
        return "треугольник:("+a+","+b+","+c+") \n";
    }


    @Override
    public double getArea() {
        double p = (a+b+c)*1.0/2;
        double p1 = p*(p-a)*(p-b)*(p-c);
        return  Math.sqrt(p1);

    }
}
