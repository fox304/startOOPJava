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

        Products limonade = new Limonade("Лимонад 'Буратино'",30,1,"бутылка",0.5f);
        Products limonade2 = new Limonade("Лимонад 'Ситро'",35,1,"бутылка",0.5f);

        Products milk = new Milk("Молоко 'Домик в деревне'",45,1,"пакет",1.5f,2.5f);
        Products milk2 = new Milk("Молоко 'Простоквашино'",50,1,"пакет",1.5f,3.5f);

        Products bread = new Bread("Хлеб бородинский",25,1,"булка","сутки","высший");
        Products bread2 = new Bread("Хлеб белый",34,1,"булка","сутки","высший");

        Products eggs = new Eggs("Яйца куриные",60,1,"плошка","30 дней",10);
        Products eggs2 = new Eggs("Яйца перепелиные",80,1,"плошка","40 дней",8);

        Products diapers = new Diapers("Памперсы универсальные",180,2,"упаковка",0,true,16,100,500,"сильно впитывают");
        Products diapers2 = new Diapers("Памперсы униплюс",200,1,"упаковка",1,true,10,150f,250f,"средняя впитываемость");

        Products nipple = new Nipple("Соска морская ",44,3,"шт",0,true);
        Products nipple2 = new Nipple("Соска весёлая",51,5,"шт",0,true);

        Products mask = new Mask("Медицинская маска",150,2,"шт",20);
        Products mask2 = new Mask("Защитная маска",110,1,"шт",10);

        Products toiletPaper = new ToiletPaper("Туалетная бумага пушок",150,4,"упаковка",16,3);
        Products toiletPaper2 = new ToiletPaper("Туалетная бумага зева",110,3,"упаковка",10,2);

        Products sosige = new Products("Колбаса сервелат",220,1,"палка");

        Products [] listOfProducts = new Products[]{limonade,limonade2,
                                                    milk,milk2,
                                                    bread,bread2,
                                                    eggs,eggs2,
                                                    diapers,diapers2,
                                                    nipple,nipple2,
                                                    mask,mask2,
                                                    toiletPaper,toiletPaper2,
                                                    sosige};

        System.out.println();
        printOfProducts(listOfProducts);
    }

    public static void printOfProducts(Products [] listProducts){
        for (Products products : listProducts) {
            System.out.println(products);

        }
    }

}
