package Seminar2.Task2;

public class Programm {
    public static void main(String[] args) {
        Animal cat1 = new Cat(20,5,"grey","Leva","sphinx",true,"silver","28.02.2015",false);
        Animal cat2 = new Cat(25,6,"blue","Vaska","siamskiy",false,"black","11.03.20",true);
        Bird bird1 = new Stork(100,20,"broun",150);
        Bird bird2 = new Chicken(15,2,"yellow",1);
        Animal tiger1 = new Tiger(40,25,"white","africa","24.12.22");
        WildAnimal wolf1 = new Wolf(35,10,"grey","forest","23.12.20","strong leader");
        Pet dog1 = new Dog(14,5,"grey","sharic","boxer",true,"black","11.10.2019",false);

        Animal [] animals = new Animal[]{cat1,cat2,bird2,bird1,tiger1,wolf1,dog1};




    }
}
