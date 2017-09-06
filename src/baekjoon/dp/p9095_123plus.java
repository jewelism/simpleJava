package baekjoon.dp;

import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 4. 15..
 * 문제
 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.

 1+1+1+1
 1+1+2
 1+2+1
 2+1+1
 2+2
 1+3
 3+1
 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

 입력
 첫쨰 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

 출력
 각 테스트 케이스마다, n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다.


 입력
 3
 4
 7
 10

 출력
 7
 44
 274

 */
public class p9095_123plus {
    public static void main(String[] args) {
        final int MAX = 11;
        int[] answer = new int[MAX];
        answer[1] = 1; //1을 만드는 경우는 1밖에없음
        answer[2] = 2; //2를 만드는경우는 1+1, 2밖에없음
        answer[3] = 4; //3을 만드는 경우는 1+1+1, 1+2, 2+1, 3 이 있음 총4가지
        //answer[4] = 7;//4를만드는경우는? 1+1+1+1 1+1+2 1+2+1 2+1+1 2+2 1+3 3+1 총7가지. - 1만드는경우+2만드는경우+3만드는경우
        for(int i=4; i<MAX; i++){ //4~10
            answer[i] = answer[i-3]+answer[i-2]+answer[i-1];
//            for(int j=1; j<=i; j++){
//                answer[i] += answer[j];
//            }
        }
//        System.out.println(Arrays.toString(answer));
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] input = new int[T+1];
        for(int i=1; i<=T; i++){
            input[i] = scan.nextInt();
        }
        for(int i=1; i<=T; i++){
            System.out.println(answer[input[i]]);
        }
    }
}
