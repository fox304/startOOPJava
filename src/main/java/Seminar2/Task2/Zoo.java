package Seminar2.Task2;


import java.util.List;
import java.util.Scanner;

public class Zoo {

    private List<Animal> animalArrayList;

    public Zoo(List<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

//    public List<Animal> getAnimalArrayList() {
//        return animalArrayList;
//    }
//    public Animal addAnimal (Animal an){
//
//    return an;
//    }

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
    public void printOneSound(Scanner scanner){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        animalArrayList.get(num-1).soundAnimal();
        scanner.close();
    }
    public void printOneAnimal(Scanner scanner){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        System.out.println(animalArrayList.get(num-1));
        scanner.close();
    }
    public void deleteOneAnimal(Scanner scanner){
        System.out.printf("Сейчас в зоопарке %s животных\n",
                animalArrayList.size());
        System.out.println("выберите номер животного ");
        int num = scanner.nextInt();
        animalArrayList.remove(num-1);
        scanner.close();
        printInfo();
    }
    public  void addOneAnimal(Scanner scanner){
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

        }
    }
}
