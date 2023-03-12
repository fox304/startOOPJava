package Seminar3.Task3;

public abstract class Polygon extends Figura implements Perimetr{
    int [] sides;

    @Override
    public void getPerimetr() {
        int sum = 0;
        System.out.print("\t\t");
        for (int si: sides) {
            System.out.print(" "+si);
            sum+=si;
        }
        System.out.printf(" периметр равен %s\n\n",sum);

    }
    public Polygon(int[] sides) {
        this.sides = sides;
    }
}
