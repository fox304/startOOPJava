package Seminar4.Task;


public class Program {
    public static void main(String[] args) {
         Integer [] list1= {23,4,65,77,23,677,77,2,6};
         DynamicArray <Integer> dynamicArray = new DynamicArray<>(list1);
         DynamicArray <Integer> dynamicArray2 = new DynamicArray<>(list1);
         DynamicArray <Integer> dynamicArray3 = new DynamicArray<>(list1.clone());


        dynamicArray.printArray();
        dynamicArray.insertItem(67); // вставка элемента
        dynamicArray.printArray();

        dynamicArray.lengthArray();         // получение длинны
        dynamicArray.deleteItemByIndex(2);  // удаление по индексу
        dynamicArray.printArray();


        dynamicArray.deleteItemsByValue(77);  // удаление по значению
        dynamicArray.printArray();

        dynamicArray.getMin();               // минимум
        dynamicArray.getMax();               // максимум

        dynamicArray.getSum();              // сумма
        dynamicArray.getProduct();          // произведение

        System.out.println(dynamicArray.findIndexOfGivenElement(20)); // получение индекса по значению

        System.out.println(dynamicArray.isAbsent(5)); // есть ли данный элемент

        dynamicArray.printArray();
        dynamicArray.bubbleSort();           // пузырьковая сортировка
        dynamicArray.printArray();
        System.out.println();

        dynamicArray2.printArray();
        dynamicArray2.insertionSort();   //  сортировка вставкой
        dynamicArray2.printArray();
        System.out.println();

        dynamicArray3.printArray();
        dynamicArray3.selectionSort();   //  сортировка простым выбором
        dynamicArray3.printArray();

        System.out.println(dynamicArray3.getValueOfGivenIndex(3)); // получение значения по индексу

        dynamicArray3.setValueOfGivenIndex(3,100);   // установка значения по индексу
        dynamicArray3.printArray();































    }
}
