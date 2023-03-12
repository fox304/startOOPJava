package Seminar3.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayFigura {
    Scanner scanner = new Scanner(System.in);
    Random rn = new Random();

    List<Figura> figuraList = new ArrayList<>();
    public void metod1(){
        figuraList.add(new Square(4));
        figuraList.add(new Rectangle(3,5));
        figuraList.add(new Circle(4));
        figuraList.add(new Triangle(2,3,4));
        figuraList.add(new Rectangle(1,2));

    }
    public  void  getInfoFigures(){
        for (Figura fg:
             figuraList) {
            fg.getArea();
            if(fg instanceof Perimetr) ((Polygon)fg).getPerimetr();
            if(fg instanceof LengthCircle)((LengthCircle) fg).getLengthCircle();
        }
    }
    public void newFigure(){
        System.out.println("""
                какую фигуру добавляете?:\s
                1) квадрат
                2) прямоугольник
                3) треугольник
                4) круг
                
                """);
        int num = scanner.nextInt();
        switch (num){
            case (1)-> figuraList.add(new Square(rn.nextInt(1,10)));
            case (2)-> figuraList.add(new Rectangle(rn.nextInt(1,10), rn.nextInt(1,10)));
            case (3)-> figuraList.add(new Triangle(rn.nextInt(1,10),rn.nextInt(1,10),rn.nextInt(1,10)));
            case (4)-> figuraList.add(new Circle(rn.nextInt(1,10)));
            default -> wrongDial();
        }


    }
    public void wrongDial(){
        System.out.println("других фигур пока нет для добавления ");
        newFigure();
    }

    public void deleteFigure(){
        System.out.printf("сейчас есть %s фигур,какую удаляете?",
                figuraList.size());
        int num = scanner.nextInt();
        if (num > 0 && num < 5) figuraList.remove(num-1);

    }



}
