package Seminar4.Task;

import java.util.Arrays;

public class DynamicArray <T> {

    private T[] t;
    private int size;

    public DynamicArray() {
    }

    public DynamicArray(T[] t) {

        this.t = t;
        this.size = t.length;

    }

    private int getSize() {
        return size;
    }
    public void printArray(){
        System.out.println(Arrays.toString(t));
    }

    public void insertItem(T  t){
        this.t = Arrays.copyOf(this.t, size + 1);
        this.t[size] = t;
        size++;

    }

    public void lengthArray(){
        System.out.println(getSize());
    }

    public void deleteItemByIndex(int index){

        for (int i = 0;i < size;i++){
            if(i > index) t[i - 1]= t[i];
        }
    }


}

