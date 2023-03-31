package part1;

import java.util.Scanner;

public class Stringg {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a);
//        String b= sc.next();
//        System.out.println(b);

//        System.out.println("write a message");
//
//        String message=sc.nextLine();
//        System.out.println("what you want to say " );
//        String desc=sc.nextLine();
//        System.out.println(message);
//        System.out.println(desc);


        String number="10";
//        int ans=Integer.valueOf(number);
//        System.out.println(ans);
//
//        Double convert=Double.valueOf(sc.next());
//        System.out.println(convert);
//
//        boolean iff=Boolean.valueOf(sc.nextBoolean());
//        System.out.println(iff);



        int[] arr={1,2,3,4};
        int[] arr1=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        arr=arr1;
        System.out.println(arr.length);
        for(int a:arr1)
            System.out.println(a);
        System.out.println(arr.length);
    }
}
