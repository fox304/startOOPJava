package Seminar4.Task;


public class Program {
    public static void main(String[] args) {
         Integer [] list1= {23,4,65,77,23,677,2,6};
         DynamicArray <Integer> dynamicArray = new DynamicArray<>(list1);

        dynamicArray.printArray();
        dynamicArray.insertItem(67);
        dynamicArray.printArray();
        dynamicArray.lengthArray();
        dynamicArray.deleteItemByIndex(2);
        dynamicArray.printArray();
























    }
}
