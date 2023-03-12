package Seminar3.Task3;

public class Program {
    public static void main(String[] args) {
        ArrayFigura array = new ArrayFigura();

        for (Figura fg :
                array.metod1()) {
            fg.getArea();
           if (fg instanceof Perimetr) ( (Polygon)fg).getPerimetr();
        }


    }
}
