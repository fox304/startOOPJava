package Seminar2.Task2;

public class Dog extends Pet{
    private boolean isTraining;


    public Dog(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, String nickName,
               String bread, boolean vaccine, String colorFur, String dateOfBirth,boolean isTraining) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                nickName, bread, vaccine, colorFur, dateOfBirth);
        this.isTraining = isTraining;
    }

    public void training(){
        if (!isTraining) {
            System.out.printf("----теперь %s дрессированный----\n",nickName);
            isTraining = true;
        }

    }

    public boolean isTraining() {
        return isTraining;
    }


    @Override
    public   String showAffection() {
        return "большая часть собак любит ласкаться ";
    }



    @Override
    public void soundAnimal() {
        System.out.println("гав-гав");
    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** её зовут %s *** порода:%s *** вакцинация:%s *** цвет шерсти:%s *** родилась:%s",
                this,this.nickName,this.bread,this.vaccine,this.colorFur,dateOfBirth);
        System.out.printf(" *** дрессированная:%s *** рост:%s вес:%s цвет глаз:%s\n",
                isTraining,hieghtAnimal,wieghtAnimal,eyesColorAnimal);

    }

    @Override
    public String toString() {
        return "собaка";
    }
}
