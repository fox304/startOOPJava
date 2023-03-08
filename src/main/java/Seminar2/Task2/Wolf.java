package Seminar2.Task2;

public class Wolf extends WildAnimal{
    private String leader;

    public String getLeader() {
        return leader;
    }

    @Override
    public void printInfo() {
        System.out.printf("этот волк %s ",leader);
    }

    @Override
    public void sound() {
        System.out.println("ауууу-аууууу");

    }
}
