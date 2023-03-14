package Seminar3.Task3;


public abstract class Figura implements Area, Comparable<Figura> {
    int [] numbers;
    int index = -1;

    public Figura(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.getArea(),o.getArea());
    }
}

