package Seminar3.Task3;

import java.util.ArrayList;
import java.util.List;

public class ArrayFigura {

    List<Figura> figuraList = new ArrayList<>();
    public  List<Figura>  metod1(){
        figuraList.add(new Square(4));
        figuraList.add(new Rectangle(3,5));
        figuraList.add(new Circle(4));
        figuraList.add(new Triangle(2,3,4));
        figuraList.add(new Rectangle(1,2));
        return figuraList;

    }





}
