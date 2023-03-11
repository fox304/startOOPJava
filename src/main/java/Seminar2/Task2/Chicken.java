package Seminar2.Task2;

public class Chicken extends Bird{


    public Chicken(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal, hightFlying);
    }


    @Override
    public void flyableAnimal() {
        System.out.println("Я не умею летать");
    }

    @Override
    public void soundAnimal() {
        System.out.println("кококо-кококо");
    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** рост:%s вес:%s цвет глаз:%s ***  высота полёта:%s\n",
                this,hieghtAnimal,wieghtAnimal,eyesColorAnimal,getHightFlying());

    }

    @Override
    public String toString() {
        return " курица";
    }
}
