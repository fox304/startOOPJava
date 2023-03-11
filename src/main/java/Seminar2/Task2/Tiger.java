package Seminar2.Task2;

public class Tiger extends WildAnimal{

    public Tiger(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,
                 String habitat, String dateLocation) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                habitat, dateLocation);
    }



    @Override
    public void soundAnimal() {
        System.out.println("рррррр-рррррр");
    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** среда обитания:%s *** дата отлова:%s *** рост:%s вес:%s цвет глаз:%s\n ",
                this,habitat,dateLocation,hieghtAnimal,wieghtAnimal,eyesColorAnimal);


    }

    @Override
    public String toString() {
        return "тигр";
    }
}

