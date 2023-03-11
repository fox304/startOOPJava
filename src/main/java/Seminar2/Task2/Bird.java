package Seminar2.Task2;

public abstract class Bird extends Animal implements Fly,FlyableBird{
    protected int hightFlying;


    public int getHightFlying() {
        return hightFlying;
    }

    protected Bird(int hieghtAnimal, int wieghtAnimal, String eyesColorAnimal,int hightFlying) {
        super(hieghtAnimal, wieghtAnimal, eyesColorAnimal);
        this.hightFlying = hightFlying;

    }

    @Override
    public void flyingAnimal() {

            System.out.printf("Я умею летать до %d метров от земли\n",
                    hieghtAnimal);
        }




    @Override
    public void flyBird() {
        if (hightFlying == 0) {
            System.out.printf("я %s, теперь ты научил меня летать \n",this);
            hightFlying = 10;
        }
    }
}
