package part1.Interface.Comparable;

import java.util.*;

public class Student implements Comparable<Student>  {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Student> all = new ArrayList<>();
        all.add(new Student("pardium", 23));
        all.add(new Student("ilu", 20));
        all.add(new Student("dhankhar", 25));


        Student st1= new Student("pardium",1);
        Student st2=new Student("ilu",2);

        st1.compareTo(st2);

//        Collections.sort(all);
//        for (Student st : all) {
//            System.out.println(st.age);
//        }
//
//        all.forEach((item) -> System.out.print(item.name));
//
//        Iterator<Student> it= all.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().age);
//        }
//
//
//
    }


    @Override
    public int compareTo(Student St) {
        if(age==St.age){
            System.out.println("both are equal");
            return 0;}
        else if (age>St.age){

            System.out.println("st1 is greater than st2");
            return 1;}
        else{

            System.out.println("st2 is greater");
            return -1;}
        }
    }

