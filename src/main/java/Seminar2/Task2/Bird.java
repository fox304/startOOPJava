package Seminar2.Task2;

public abstract class Bird extends Animal implements Flyable{
    private int hightFlying;


    protected int getHightFlying() {
        return hightFlying;
    }

    protected Bird(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
        this.hightFlying = hightFlying;

    }



}
