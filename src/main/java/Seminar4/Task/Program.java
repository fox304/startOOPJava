package Seminar4.Task;


public class Program {
    public static void main(String[] args) {
         Integer [] list1= {23,4,65,77,23,677,77,2,6};
         DynamicArray <Integer> dynamicArray = new DynamicArray<>(list1);

        dynamicArray.printArray();
        dynamicArray.insertItem(67);
        dynamicArray.printArray();
        dynamicArray.lengthArray();
        dynamicArray.deleteItemByIndex(2);
        dynamicArray.printArray();


        dynamicArray.deleteItemsByValue(77);
        dynamicArray.printArray();
        dynamicArray.getMin();
        dynamicArray.getMax();

        dynamicArray.getSum();
        dynamicArray.getProduct();
        System.out.println(dynamicArray.findIndexOfGivenElement(20));

        System.out.println(dynamicArray.isAbsent(5));
























    }
}
