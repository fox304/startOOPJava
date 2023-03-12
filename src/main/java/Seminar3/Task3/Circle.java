package Seminar3.Task3;

public class Circle extends Figura {
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
        System.out.printf("%s: площадь равна : %s\n",this,r*r*Math.PI);
    }


}
