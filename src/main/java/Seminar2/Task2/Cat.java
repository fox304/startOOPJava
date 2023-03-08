package Seminar2.Task2;

public class Cat extends Pet{
    private  boolean fur;

    public Cat(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, String nickName,
               String bread, boolean vaccine, String colorFur, String dateOfBirth,boolean fur) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                nickName, bread, vaccine, colorFur, dateOfBirth);
        this.fur = fur;
    }

    public boolean isFur(){
        return fur;
    }

    @Override
    void showAffection() {
        System.out.println("Кот - ласковое животное");
    }

    @Override
    public void printInfo() {
        System.out.printf("У этой кошки %s шерсть",fur);
    }

    @Override
    public void sound() {
        System.out.println("мяу-мяу");

    }
}
