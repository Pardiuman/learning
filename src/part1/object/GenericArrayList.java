package part1.object;

import java.util.Arrays;
import java.util.List;

public class GenericArrayList<t> {

    private Object[] arr;
    private int defaultSize=10;
    private int size=0;

    public GenericArrayList() {
        arr= new Object[defaultSize];
    }

    public GenericArrayList(int size) {
        arr=new Object[size];
    }

    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }

    public void add(t value){
        if(size>=defaultSize){
            Object[] temp=new Object[defaultSize*2];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
//            throw new ArrayStoreException();
        arr[size]=value;
        size++;
    }



    public static void main(String[] args) {
        GenericArrayList<Integer> list =new GenericArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);


        System.out.println(list);

        List<Integer> lst=new java.util.ArrayList<>();
        lst.add(10);
        lst.add(10);
        lst.add(10);
        lst.add(10);
        lst.forEach((item) -> System.out.println(item));
        System.out.println(lst.getClass());
        List<Integer> list1 = List.of(1,2,3,4,5,6,7);
        System.out.println(list1.getClass());
    }
}
