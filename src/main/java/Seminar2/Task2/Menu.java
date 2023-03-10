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
        System.out.println("""
                7) изменение свойств животных :\s
                \t\tу недрессированных собак - дрессировка\s
                \t\tу нелетающих птиц - умение летать
                \t\tу домашних животных без ласки - наделить таковой\s""");

        int number = scanner.nextInt();
        System.out.println("---------------------------------------------------");

        switch (number) {
            case (1) -> zoo.addOneAnimal();
            case (2) -> zoo.deleteOneAnimal();
            case (3) -> zoo.printOneAnimal();
            case (4) -> zoo.printOneSound();
            case (5) -> zoo.printInfo();
            case (6) -> zoo.printSounds();
            case (7) -> zoo.ableAnimals();
            default -> wrongDial(zoo);
        }
        System.out.println("--------------------------------------------------");

    }
    public static void wrongDial(Zoo zoo){
        System.out.println("Неверный набор - попробуй ещё ");
        createMenu(zoo);
    }

}
