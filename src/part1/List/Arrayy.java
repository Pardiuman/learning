package part1.List;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayy {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<=5; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
