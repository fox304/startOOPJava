package Seminar3.Task3;

import java.util.*;

public class ArrayFigura {
    Scanner scanner = new Scanner(System.in);
    Random rn = new Random();

    List<Figura> figuraList = new ArrayList<>();


    public void defaultFigures() {
        figuraList.add(new Square(5));
        figuraList.add(new Rectangle(3, 5));
        figuraList.add(new Circle(4));
        figuraList.add(new Triangle(2, 3, 4));
        figuraList.add(new Rectangle(1, 2));


    }

    public void getInfoFigures() {
        System.out.println("------------------------------------------------------");
        for (Figura fg : figuraList) {
            System.out.println(fg.toString());
            System.out.println("\tплощадь: "+fg.getArea());
            if (fg instanceof Perimetr) {
                System.out.println("\tпериметр: "+
                        ((Polygon) fg).getPerimetr());

            }
            if (fg instanceof LengthCircle) {

                System.out.println("\tдлина окружности: "+
                        ((LengthCircle) fg).getLengthCircle());
            }


            System.out.println("-------------------------");

        }
        System.out.println("------------------------1");
    }

    public Figura newFigure() {


        switch (listFigure()) {
            case (1) -> {
                return new Square(rn.nextInt(1, 10));
            }
            case (2) -> {
                return new Rectangle(rn.nextInt(1, 10), rn.nextInt(1, 10));
            }
            case (3) -> {
                return new Triangle(rn.nextInt(1, 10), rn.nextInt(1, 10), rn.nextInt(1, 10));
            }
            case (4) -> {
                return new Circle(rn.nextInt(1, 10));
            }
            default -> wrongDial();
        }
        return null;


    }

    public void wrongDial() {
        System.out.println("других фигур пока нет для добавления ");
        newFigure();
    }

    public void deleteFigure() {
        System.out.printf("сейчас есть %s фигур,какую удаляете?",
                figuraList.size());
        int num = scanner.nextInt();
        if (num > 0 && num < figuraList.size()+1) figuraList.remove(num - 1 );


    }
    public  void replaceFigura(){
        System.out.println("какую фигуру вы хотите заменить?");
        Figura fg = newFigure();
        System.out.println("введите индекс для замены выбранной фигуры:");
        int index = scanner.nextInt();
        figuraList.set(index-1,fg);


    }
    public  void addNewFigura(){
        System.out.println("какую фигуру вы добавдяете?");
        figuraList.add(newFigure());
    }

    public void sortOfArea() {
        Collections.sort(figuraList);


    }
    public int listFigure(){
        System.out.println("""
                
                1) квадрат\s
                2) прямоугольник
                3) треугольник
                4) круг
                                
                """);

        return scanner.nextInt();
    }

}
