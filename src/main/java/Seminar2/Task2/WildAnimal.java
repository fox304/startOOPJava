package Seminar2.Task2;

public abstract class WildAnimal extends Animal{
    String habitat;
    String dateLocation;

    public WildAnimal(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,
                      String habitat,String dateLocation) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
        this.habitat = habitat;
        this.dateLocation = dateLocation;
    }
}
