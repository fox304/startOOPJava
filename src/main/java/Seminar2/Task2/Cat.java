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
}
