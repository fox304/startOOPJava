package Seminar2.Task2;

public class Stork extends Bird{


    public Stork(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal, hightFlying);
    }

    @Override
    public void printInfo() {
        System.out.println("stork");
    }

    @Override
    public void sound() {
        System.out.println("уаааа-уааааа");
    }
}
