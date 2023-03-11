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
    public void soundAnimal() {
        System.out.println("мяу-мяу");
    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** её зовут %s *** порода:%s *** вакцинация:%s *** цвет шерсти:%s *** родилась:%s",
                this,this.nickName,this.bread,this.vaccine,this.colorFur,dateOfBirth);
        System.out.printf("  *** рост:%s вес:%s цвет глаз:%s *** наличие шерсти:%s\n",
                hieghtAnimal,wieghtAnimal,eyesColorAnimal,fur);

    }

    @Override
    public String toString() {
        return " кошка";
    }

    @Override
    public String showAffection() {
        return "Коты ласковые животные";
    }
}
