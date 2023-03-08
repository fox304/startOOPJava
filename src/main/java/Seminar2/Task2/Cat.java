package Seminar2.Task2;

public class Cat extends Pet{
    private  boolean fur;
    public boolean isFur(){
        return fur;
    }

    @Override
    void showAffection() {
        System.out.println("Кот - ласковое животное");
    }

    @Override
    public void printInfo() {
        System.out.printf("У этой кошки %s шерсть",fur);
    }

    @Override
    public void sound() {
        System.out.println("мяу-мяу");

    }
}
