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
        return "треугольник";
    }


    @Override
    public void getArea() {
        double p = (a+b+c)*1.0/2;
        double p1 = p*(p-a)*(p-b)*(p-c);
        System.out.printf("%s: площадь равна %s\n",this,Math.sqrt(p1));
    }
}
