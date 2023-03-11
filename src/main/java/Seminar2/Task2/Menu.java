package Seminar2.Task2;

import java.util.Scanner;

public class Menu {
    public static void createMenu(Zoo zoo){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите цифру из контекстное меню: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1) Добавить животное в зоопарк");
        System.out.println("2) Убрать животное с номером i из зоопарка");
        System.out.println("3) Информация о животном с номером i");
        System.out.println("4) Животное с номером i издатёт звук");
        System.out.println("5) Информация о животных, которые есть на данный момент в зоопарке");
        System.out.println("6) Животные,которые в зоопарке издают такие звуки");

        int number = scanner.nextInt();

        switch (number) {
            case (1) -> zoo.addOneAnimal(scanner);
            case (2) -> zoo.deleteOneAnimal(scanner);
            case (3) -> zoo.printOneAnimal(scanner);
            case (4) -> zoo.printOneSound(scanner);
            case (5) -> zoo.printInfo();
            case (6) -> zoo.printSounds();
            default -> wrongDial(zoo);

        }

    }
    public static void wrongDial(Zoo zoo){
        System.out.println("Неверный набор - попробуй ещё ");
        createMenu(zoo);
    }








}
