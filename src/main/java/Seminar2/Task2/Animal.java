package Seminar2.Task2;

public abstract class Animal implements PrintInfoAnimal,SoundMaking{
    int hieghtAnimal;
    int wieghtAnimal;
    String eyesColorAnimal;

    public Animal(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal) {
        this.hieghtAnimal = hieghtAnimal;
        this.wieghtAnimal = wieghtAnimal;
        this.eyesColorAnimal = eyesColorAnimal;
    }



}
