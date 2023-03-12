package Seminar3.Task3;

public class Circle extends Figura implements LengthCircle{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "круг";
    }

    @Override
    public void getArea() {
        System.out.printf("%s: площадь равна : %s\n\t\t",this,r*r*Math.PI);
    }


    @Override
    public void getLengthCircle() {
        System.out.printf("длина окружности равна %s\n\n",r*2*Math.PI);
    }
}
