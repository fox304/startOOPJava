package Seminar2.Task2;


import java.util.List;
import java.util.Scanner;

public class Zoo {
    Scanner scanner = new Scanner(System.in);

    private List<Animal> animalArrayList;

    public Zoo(List<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    @Override
    public String toString() {
        return animalArrayList.toString();
    }
    public void printInfo(){
        for (Animal an :
                animalArrayList) {
            an.printInfoAnimal();
            System.out.println();
        }
    }
    public  void printSounds(){
        for (Animal an:
             animalArrayList) {
            an.soundAnimal();
        }
    }
    public void printOneSound(){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        animalArrayList.get(num-1).soundAnimal();

    }
    public void printOneAnimal(){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        animalArrayList.get(num-1).printInfoAnimal();

    }
    public void deleteOneAnimal(){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        System.out.printf("теперь в зоопарке нет %s\n",animalArrayList.get(num - 1).toString());
        System.out.println("------------------------------------");
        animalArrayList.remove(num-1);

        printInfo();
    }
    public  void addOneAnimal(){
        System.out.println("Какое животное добавить?");
        System.out.println("1) Кошка");
        System.out.println("2) собака");
        System.out.println("3) аист");
        System.out.println("4) курица");
        System.out.println("5) волк");
        System.out.println("6) тигр");
        int num = scanner.nextInt();
        switch (num){
            case (1) -> animalArrayList.add(AddDefferensAnimals.addCat());
            case (2) -> animalArrayList.add(AddDefferensAnimals.addDog());
            case (3) -> animalArrayList.add(AddDefferensAnimals.addStork());
            case (4) -> animalArrayList.add(AddDefferensAnimals.addChicken());
            case (5) -> animalArrayList.add(AddDefferensAnimals.addWolf());
            case (6) -> animalArrayList.add(AddDefferensAnimals.addTiger());
            default -> bug();

        }
        System.out.printf("теперь в зоопарк добавлен %s\n",
                animalArrayList.get(animalArrayList.size()-1).toString());
        System.out.println("--------------------------------------------");
        printInfo();
    }
    public void bug(){
        System.out.println("добавление других животных пока не предусмотрено");
        addOneAnimal();
    }
    public void ableAnimals(){
        for (Animal an :
                animalArrayList) {
            if (an instanceof TrainAble) ((TrainAble) an).train();
            if (an instanceof FlyableBird) ((FlyableBird) an).flyBird();
        }
    }
}
