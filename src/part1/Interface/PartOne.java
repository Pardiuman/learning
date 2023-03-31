package part1.Interface;

interface Inter{
//    void print();

    int sum(int a,int b);
}

public class PartOne {
    public static void main(String[] args) {
        String name="pardium";

//        Inter inter= new Inter() {
//            @Override
//            public void print() {
//                System.out.println("hello "+name);
//            }
//        };
//
//        inter.print();
//
//
//        Inter two = () -> {
//            System.out.println("hello "+name);
//
//        };
//        two.print();
        int x=10;
        int y=20;

        Inter inter = (a,b) -> {
            return a+b;
        };

        System.out.println(inter.sum(x,y));

        Inter two= new Inter() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

    }
}
