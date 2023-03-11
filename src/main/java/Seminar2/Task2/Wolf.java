package Seminar2.Task2;

public class Wolf extends WildAnimal{
    private String leader;

    public Wolf(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,
                String habitat, String dateLocation,String leader) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal,
                habitat, dateLocation);
        this.leader = leader;
    }

    public String getLeader() {
        return leader;
    }



    @Override
    public void soundAnimal() {
        System.out.println("ауууу-аууууу");
    }

    @Override
    public void printInfoAnimal() {
        System.out.printf("%s *** среда обитания:%s *** дата отлова:%s *** статус лидера:%s *** рост:%s вес:%s цвет глаз:%s\n",
                this,habitat,dateLocation,leader,hieghtAnimal,wieghtAnimal,eyesColorAnimal);


    }

    @Override
    public String toString() {
        return "это волк ";
    }
}
