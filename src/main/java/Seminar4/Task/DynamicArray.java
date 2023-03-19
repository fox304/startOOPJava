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
        t = Arrays.copyOf(t,size-1);
        size--;
    }
    public  void deleteItemsByValue(T value){
        int count = 0;

        for (int i = 0;i < size;i++){
            if(t[i].equals(value)) count++;
            else t[i-count] = t[i];
        }
        size-=count;
        t = Arrays.copyOf(t,size);
    }
    public void getMin(){
        int min = (Integer) t[0];
        for (int i = 1;i < size;i++) {
            if((Integer) t[i] < min)  {
                min = (Integer) t[i];
            }
        }
        System.out.println(min);
    }
    public void getMax(){
        int max = 0;
        for (int i = 1;i < size;i++) {
            if ( (Integer) t[i] > max) {
                max = (Integer) t[i];
            }
        }
        System.out.println(max);

    }
    public void getSum(){
        int sum = 0;
        for (int i = 0;i < size;i++) {
           sum += ((Integer) t[i]);
        }
        System.out.println(sum);
    }
    public void getProduct(){
        int product = 1;
        for (int i = 0;i < size;i++) {
            product *= ((Integer) t[i]);
        }
        System.out.println(product);
    }
    public int findIndexOfGivenElement(T value){
        int index = -1;
        for (int i = 0;i < size;i++) {
            if (value.equals(t[i])){
               index =i;
                break;
            }
        }
        return index;
    }
    public boolean isAbsent(T item){
        boolean isThere = false;
        for (int i = 0;i < size;i++) {
            if (item.equals(t[i])) {
                isThere = true;
                break;
            }
        }
        return isThere;
    }




}

