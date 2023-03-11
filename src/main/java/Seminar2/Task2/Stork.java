package Seminar2.Task2;

public class Stork extends Bird{


    public Stork(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal, hightFlying);
    }


    @Override
    public void soundAnimal() {

            System.out.println("уаааа-уааааа");

    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** рост:%s вес:%s цвет глаз:%s ***  высота полёта:%s\n",
                this,hieghtAnimal,wieghtAnimal,eyesColorAnimal,getHightFlying());

    }




    @Override
    public String toString() {
        return " аист ";
    }


}
