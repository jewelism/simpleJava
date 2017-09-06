package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 5. 26..
 * 
 * 5
 5
 2
 3
 4
 1
 */
public class p2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] input = new int[N];
        for(int i=0; i<N; i++){
            input[i] = scan.nextInt();
        }
        Arrays.sort(input);

        for(int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
        System.out.println(Arrays.toString(input));
//        String s = "boseok";
//        StringBuilder sb = new StringBuilder(s);
//
//        System.out.println(sb.reverse().toString());
    }
}
