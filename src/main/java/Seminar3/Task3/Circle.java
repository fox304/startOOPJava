package Seminar3.Task3;

public class Circle extends Figura implements LengthCircle{
    private int r;

    public Circle(int r) {
        super(new int[r]);
        this.r = r;
    }

    @Override
    public String toString() {
        return "круг:(радиус "+r+")\n";
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }


    @Override
    public double getLengthCircle() {
        return 2*r*Math.PI;
    }
}
