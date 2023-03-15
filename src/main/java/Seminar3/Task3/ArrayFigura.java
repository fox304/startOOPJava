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
        System.out.println("-------------------------");
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
                int a = rn.nextInt(1, 10);
                int b = rn.nextInt(1, 10);
                int c = rn.nextInt(1, 10);
                return new Triangle(a,b,errorsHandling(a,b,c));
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

        while (num < 1 || num > figuraList.size()) {

            System.out.println("других фигур пока нет для удаления," +
                    " введите снова");
            num = scanner.nextInt();

        }
        System.out.printf("удалена фигура номер %s: %s",
                num,figuraList.get(num-1).toString());
        figuraList.remove(num - 1);



    }

    public  void replaceFigura(){

        System.out.println("какую фигуру вы хотите вставить?");
        Figura fg = newFigure();
        System.out.printf("""
                        введите индекс для вставки выбранной фигуры,
                        всего %s фигур
                        :""",
                figuraList.size());
        int index = scanner.nextInt();
        while (index > figuraList.size()) {

            System.out.println("сделайте правильный ввод");
            index = scanner.nextInt();
        }

        figuraList.add(index-1,fg);


    }
    public  void addNewFigura(){
        System.out.println("какую фигуру вы добавдяете?");
        figuraList.add(newFigure());
        System.out.printf("вы добавили фигуру : %s",
               figuraList.get(figuraList.size()-1));
    }

    public void sortOfArea() {
        System.out.println("сортируем фигуры по площади:");
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

    public int errorsHandling(int a,int b,int c) {
        System.out.printf("треугольник сo сторонами (%s,%s,%s) не существует, ", a, b, c);
        System.out.println("поэтому сгенерируем другой треугольник  ");
        for (int i = 1; i < 11; i++) {
            if (a < (b + i) && b < (a + i) && i < (a + b)) {
                c = i;
                return c;
            }
        }
        return 0;
    }

}
