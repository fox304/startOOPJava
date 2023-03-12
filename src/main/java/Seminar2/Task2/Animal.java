package Seminar2.Task2;

public abstract class Animal  {
   protected int hieghtAnimal;
   protected int wieghtAnimal;
    String eyesColorAnimal;

    public Animal(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal) {
        this.hieghtAnimal = hieghtAnimal;
        this.wieghtAnimal = wieghtAnimal;
        this.eyesColorAnimal = eyesColorAnimal;
    }
    abstract public void soundAnimal();
    abstract public void printInfoAnimal();


}
