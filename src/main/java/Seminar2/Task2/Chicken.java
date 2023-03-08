package Seminar2.Task2;

public class Chicken extends Bird{


    public Chicken(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal, hightFlying);
    }

    @Override
    public void printInfo() {
        System.out.println("chicken");

    }

    @Override
    public void sound() {
        System.out.println("кококо-кококо");

    }
}
