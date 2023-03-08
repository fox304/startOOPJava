package Seminar2.Task2;

public class Stork extends Bird{
    public Stork(int hightFlying) {
        super(hightFlying);
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
