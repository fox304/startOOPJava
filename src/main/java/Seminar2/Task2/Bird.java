package Seminar2.Task2;

public abstract class Bird extends Animal{
    private int hightFlying;

    public int getHightFlying() {
        return hightFlying;
    }

    public Bird(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
        this.hightFlying = hightFlying;
    }

    void fly(){
        System.out.printf("Я лечу на %s метрах ",hightFlying);
    }

}
