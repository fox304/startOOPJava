package Seminar3.Task3;

public abstract class Polygon extends Figura implements Perimetr{
    private int [] sides;

    @Override
    public int getPerimetr() {
        int sum = 0;
        for (int item: sides) {
            sum+=item;

        }

        return sum;

    }
    public Polygon(int[] sides) {
        super(sides);
        this.sides = sides;
    }


}
