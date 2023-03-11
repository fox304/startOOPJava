package Seminar2.Task2;

public class Programm {
    public static void main(String[] args) {
        Zoo zoo = DefaultAnimal.start();
        while (true)Menu.createMenu(zoo);


        }

}
