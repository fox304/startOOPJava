package Seminar2.Task2;

public class Tiger extends WildAnimal{

    public Tiger(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,
                 String habitat, String dateLocation) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                habitat, dateLocation);
    }

    @Override
    public void printInfo() {
        System.out.println("tiger");
    }

    @Override
    public void sound() {
        System.out.println("рррррр-рррррр");

    }
}
