package Seminar2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultAnimal {
    public static Zoo start() {
        Cat cat1 = new Cat(20, 5, "grey", "Лёва", "сфинкс", true, "silver", "28.02.2015", false);
        Cat cat2 = new Cat(25, 6, "blue", "Васька", "сиамская", false, "black", "11.03.20", true);
        Bird bird1 = new Stork(100, 20, "broun", 150);
        Bird bird2 = new Chicken(15, 2, "yellow", 0);
        Animal tiger1 = new Tiger(40, 25, "white", "africa", "24.12.22");
        WildAnimal wolf1 = new Wolf(35, 10, "grey", "forest", "23.12.20", "strong leader");
        Pet dog1 = new Dog(14, 5, "grey", "Шарик", "боксёр", true, "black", "11.10.2019", false);

        List <Animal>anLisl = new ArrayList<>(Arrays.asList(cat1, cat2, bird1, bird2, tiger1, wolf1, dog1));


        Zoo zoo = new Zoo(anLisl);
        System.out.println();
        return zoo;



    }
}
