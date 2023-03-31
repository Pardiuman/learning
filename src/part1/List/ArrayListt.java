package part1.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListt {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        for(int i=0;i<5;i++){
            list.add(20);
        }

        List<Integer> list1 = List.of(1,2,3,4,5);
        int n=30;

        list.add(1,n);


        list.addAll(0,list1);


        list.remove(1);

        list.removeAll(list1);
        System.out.println(list.contains(1));

        Iterator<Integer> copy  = list.listIterator();
        while(copy.hasNext()){
            System.out.println(copy.next());
        }
        list.trimToSize();
        System.out.println(list.size());
        System.out.println(list);


//        at time of inserting objects autotbox objects implicitly so,
//            thats why we need to unbox the objects explicitly when we retrieve them.
//        int result = (int) list.get(10);





    }

}
