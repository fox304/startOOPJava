package Seminar2.Task2;

public abstract class Bird extends Animal{
    private int hightFlying;

    public int getHightFlying() {
        return hightFlying;
    }

    public Bird(int hightFlying) {
        super();
        this.hightFlying = hightFlying;
    }

    public Bird(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
    }

    void fly(){
        System.out.printf("Я лечу на %s метрах ",hightFlying);
    }

}
