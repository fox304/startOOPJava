package Seminar2.Task2;

public class Dog extends Pet implements TrainAble{
    private boolean isTraining;


    public Dog(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal, String nickName,
               String bread, boolean vaccine, String colorFur, String dateOfBirth,boolean isTraining) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                nickName, bread, vaccine, colorFur, dateOfBirth);
        this.isTraining = isTraining;
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

    @Override
    public void train() {
        if (isTraining) {

            System.out.println("Вообще-то она уже дрессированная!!!");
        }
        else {
            System.out.println("Отлично, ты сделал всех собак  дрессированными!!!");
            isTraining = true;

        }
    }
}
