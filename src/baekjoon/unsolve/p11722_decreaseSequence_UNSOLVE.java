package baekjoon.unsolve;

import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 5. 3..
 * 수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.

 예를 들어, 수열 A = {10, 30, 10, 20, 20, 10} 인 경우에
 가장 긴 감소하는 부분 수열은 A = {30, 20, 10}  이고, 길이는 3이다.
 
 
 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 6
 10 30 10 20 20 10

 첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.
 3
 
 */

public class p11722_decreaseSequence_UNSOLVE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int tmp = 0;
        int cnt = 0;
        int tmpLen = 0;
        int maxLen = 0;
        int lenCount = 0;
        int[] seq = new int[len];
        int[] cl = new int[20];
        for(int i=0; i<len; i++) {
            seq[i] = scan.nextInt();
        }
        for(int i=0; i<len; i++){
            tmp = seq[i];
            for(int j=i+1; j<len; j++){
                if(tmp>seq[j]){
                    cnt++;
                    tmp=seq[j];
                }
            }
            cl[i] = cnt;
        }
        
        for(int k=0; k<cl.length; k++){
            System.out.print(cl[k]+" ");    
        }
        
        int tmpMax = 0;
        for(int i=0; i<cl.length; i++){
            if(tmpMax<cl[i]){
                tmpMax=cl[i];
            }
        }
        System.out.println(tmpMax);
    }
}
