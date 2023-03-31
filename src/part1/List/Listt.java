package part1.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listt {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(5);
        }
        int n=10;
        list.add(5,n);


//        here we don't need to unbox objects because list didn't autotbox objects during insertions
        int result = list.get(3);

        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}
