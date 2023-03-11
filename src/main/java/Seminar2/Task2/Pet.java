package Seminar2.Task2;

public abstract class Pet extends Animal{
    String nickName;
    String bread;
    boolean vaccine;
    String colorFur;
    String dateOfBirth;

    public Pet(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,
               String nickName,String bread,boolean vaccine,String colorFur,String dateOfBirth) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
        this.nickName = nickName;
        this.bread = bread;
        this.vaccine = vaccine;
        this.colorFur = colorFur;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract String showAffection();


}
