package Seminar2.Task2;

public class Dog extends Pet{
    private boolean isTraining;

    public Dog(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, String nickName,
               String bread, boolean vaccine, String colorFur, String dateOfBirth,boolean isTraining) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                nickName, bread, vaccine, colorFur, dateOfBirth);
        this.isTraining = isTraining;
    }

    void training(){
        System.out.println("----Ату----");
    }

    public boolean isTraining() {
        return isTraining;
    }

    @Override
    void showAffection() {
        System.out.println("Большая часть собак ласковая");
    }

    @Override
    public void printInfo() {
        System.out.printf("эта собака %S тренировке",isTraining);
    }

    @Override
    public void sound() {
        System.out.println("гав-гав");

    }
}
