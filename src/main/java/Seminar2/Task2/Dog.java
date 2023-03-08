package Seminar2.Task2;

public class Dog extends Pet{
    private boolean isTraining;
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

}
