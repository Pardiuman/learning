package part1.inheritance.One;

import java.util.Arrays;

public class Custom {

    public int[] arr;
    public int initialCapacity=10;
    public int index=0;

    public Custom() {
        this.arr=new int[this.initialCapacity];
    }

    public Custom(int initialCapacity) {
        this.arr=new int[initialCapacity];
    }

    public void add(int value){
        arr[index]=value;
        index++;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        Custom arr1=new Custom();
        arr1.add(10);
        System.out.println(arr1);


    }



}
