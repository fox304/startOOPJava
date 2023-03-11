package Seminar2.Task2;

public class AddDefferensAnimals {
    public static Cat addCat(){

        return new Cat(18, 6, "серые", "Лёва", "сфинкс", true, "рыжий", "26.05.2018", true);

    }
    public  static Dog  addDog(){
        return new Dog(13, 2, "жёлтые", "Тузик", "лайка", false, "коричневый", "01.05.2020", false);

    }
    public  static Chicken  addChicken(){

        return new Chicken(10, 3, "серые", 0);

    }
    public  static Stork  addStork() {
        return new Stork(30, 17, "зелёные", 160);
    }
    public  static Wolf  addWolf(){
        return new  Wolf(18, 14, "grey", "forest", "26.02.15", "не вожак");
    }
    public  static Tiger  addTiger(){
        return new Tiger(33, 30, " blue", "india", "24.03.21");
    }
}
