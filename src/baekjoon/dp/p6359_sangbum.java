package baekjoon.dp;

import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 4. 15..
 * 문제
 * 서강대학교 곤자가 기숙사의 지하에는 n개의 방이 일렬로 늘어선 감옥이 있다. 각 방에는 벌점을 많이 받은 학생들이 구금되어있다.
 * <p>
 * 그러던 어느날, 감옥 간수인 상범이는 지루한 나머지 정신나간 게임을 하기로 결정했다.
 * 게임의 첫 번째 라운드에서 상범이는 위스키를 한 잔 들이키고, 달려가며 감옥을 한 개씩 모두 연다.
 * 그 다음 라운드에서는 2, 4, 6, ... 번 방을 다시 잠그고,
 * 세 번째 라운드에서는 3, 6, 9, ... 번 방이 열려있으면 잠그고, 잠겨있다면 연다.
 * <p>
 * 같은 방식으로 n번의 라운드를 진행한 이후, 상범이는 위스키의 마지막 병을 마시고 쓰러져 잠든다.
 * <p>
 * 구금되어있는 몇 명(어쩌면 0명)의 학생들은 자신의 방을 잠그지 않은 채 상범이가 쓰러져버렸단 것을 깨닫고 즉시 도망친다.
 * <p>
 * 방의 개수가 주어졌을 때, 몇 명의 학생들이 도주할 수 있는지 알아보자.
 * <p>
 * 입력
 * 입력의 첫 번째 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 한 개씩 방의 개수 n(5≤n≤100)이 주어진다.
 * <p>
 * 2
 * 5
 * 100
 * <p>
 * 출력
 * 한 줄에 한 개씩 각 테스트 케이스의 답, 즉 몇 명이 탈출할 수 있는지를 출력한다.
 * <p>
 * 2
 * 10
 */
public class p6359_sangbum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] numsOfRoom = new int[T];
        int[] count = new int[T]; //열린방의 갯수
        for (int i = 0; i < T; i++) {
            numsOfRoom[i] = scan.nextInt(); //i번째의 방갯수(n)
        }

        for (int testCase = 0; testCase < T; testCase++) { //테스트케이스만큼
            boolean[] flag = new boolean[numsOfRoom[testCase]+1]; //각 테스트케이스의 방갯수만큼 열렸는지 안열렸는지 판별하는 flag변수
//            for(int i=1; i<= numsOfRoom[testCase]; i++){
//                flag[i] = false; //모든방의 기본값을 닫힘(false)로 초기화
//            }
            for (int round = 1; round <= numsOfRoom[testCase]; round++) { //1라운드~n라운드
//                System.out.println("round:"+round);
                for (int n = 1; n <= numsOfRoom[testCase]; n++) { //각 테스트케이스의 방갯수만큼 반복
//                    System.out.println(round+"/"+n+"/"+round*n);
                    if(numsOfRoom[testCase]>=round*n) {//인덱스 초과하는거는 무시하기위해
                        flag[round*n] = !flag[round*n]; //방을 열거나 열렸으면 닫는다
                    }
                }
            }
            for(int i=1; i<=numsOfRoom[testCase]; i++){
                if(flag[i]) { //true를 방이 열려있는것이라고 설정
                    count[testCase]++;
//                    System.out.println("방:"+i+" ");
                }
            }
        }
        for(int i=0; i<count.length; i++){
            System.out.println(count[i]);
        }
//        System.out.println(Arrays.toString(count));
    }
}
