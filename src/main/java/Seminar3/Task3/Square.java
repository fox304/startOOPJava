package Seminar3.Task3;

public class Square extends Rectangle{
    public Square(int a) {
        super(a,a);
    }

    @Override
    public String toString() {
//        return String.format("квадрат: \n\tплощадь: %s\n\tпериметр: %s",
//                getArea(),this.getPerimetr());

        return "квадрат:("+a+")\n";
    }
}
