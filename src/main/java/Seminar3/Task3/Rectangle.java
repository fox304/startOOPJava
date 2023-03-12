package Seminar3.Task3;

public  class Rectangle extends Polygon {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        super(new int[] {a,b,a,b});
        this.a = a;
        this.b = b;

    }

    @Override
    public void getArea() {
        System.out.printf("%s: площадь равна %s * %s = %s\n",this,a,b,a*b);
    }

    @Override
    public String toString() {
        return "прямоугольник";
    }
}
