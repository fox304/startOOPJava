package Seminar1.Task;

import Seminar1.Task.Beveragise.Limonade;
import Seminar1.Task.Beveragise.Milk;
import Seminar1.Task.FoodProducts.Bread;
import Seminar1.Task.FoodProducts.Eggs;
import Seminar1.Task.GoodsForChildren.Diapers;
import Seminar1.Task.GoodsForChildren.Nipple;
import Seminar1.Task.HygieneItems.Mask;
import Seminar1.Task.HygieneItems.ToiletPaper;

public class Programm {
    public static void main(String[] args) {
        Products limonade = new Limonade("Буратино",30,1,"литры",0.5f);
        Products limonade2 = new Limonade("Ситро",35,1,"литры",0.5f);

        Products milk = new Milk("Домик в деревне",45,1,"литры",1.5f,2.5f);
        Products milk2 = new Milk("Простоквашино",50,1,"литры",1.5f,3.5f);

        Products bread = new Bread("Бородинский",25,1,"булка","сутки","высший");
        Products bread2 = new Bread("Белый",34,1,"булка","сутки","высший");

        Products eggs = new Eggs("куриные",60,1,"плошка","30 дней",10);
        Products eggs2 = new Eggs("перепелиные",80,1,"плошка","40 дней",8);

        Products diapers = new Diapers("памперсы универсальные",180,1,"упаковка",0,true,6,100,500,"сильно впитывают");
        Products diapers2 = new Diapers("памперсы униплюс",200,1,"упаковка",1,true,8,150f,250f,"средняя впитываемость");

        Products nipple = new Nipple("морская",44,3,"силикон",0,true);
        Products nipple2 = new Nipple("весёлая",51,5,"силикон",0,true);

        Products mask = new Mask("медецинская",150,2,"х/б",20);
        Products mask2 = new Mask("защитная",110,1,"х/б",10);

        Products toiletPaper = new ToiletPaper("пушок",150,2,"бумага",16,3);
        Products toiletPaper2 = new ToiletPaper("зева",110,1,"бумага",10,2);

        Products [] listOfProducts = new Products[]{limonade,limonade2,
                                                    milk,milk2,
                                                    bread,bread2,
                                                    eggs,eggs2,
                                                    diapers,diapers2,
                                                    nipple,nipple2,
                                                    mask,mask2,
                                                    toiletPaper,toiletPaper2};

        printOfProducts(listOfProducts);
    }

    public static void printOfProducts(Products [] listProducts){
        for (Products products : listProducts) {
            System.out.println(products);

        }
    }

}
