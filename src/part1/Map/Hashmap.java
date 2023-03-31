package part1.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {



        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"pardium");
        map.put(2,"dhankhar");
//        map.put(1,"ilu");
        map.put(null,"boss");


        System.out.println(map);

        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getValue());
        }

        Iterator it = map.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        for(Integer a: map.keySet()){
//            System.out.println(map.get(a));
//        }

        map.forEach((key,value) -> {
            System.out.println("thisnis the value-> "+value);
        });


    }

}
