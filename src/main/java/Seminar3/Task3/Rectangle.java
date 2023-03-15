package Seminar3.Task3;


public  class Rectangle extends Polygon  {
    public int a;
    public int b;


    public Rectangle(int a, int b) {
        super(new int[] {a,b,a,b});
        this.a = a;
        this.b = b;

    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "прямоугольник:("+a+","+b+","+a+","+b+")\n";
    }


}
