package part1.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("enter name: ");
            String name = scn.nextLine();

            if (name.isEmpty())
                break;
//            System.out.println("enter age:- ");
//            int age=Integer.valueOf(scn.nextInt());
            list.add(new Person(name));

            System.out.println(list.toString());

            list.add(new Person("neeraj", 34));

        }

    }
}
