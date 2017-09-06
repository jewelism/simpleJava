package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 4. 20..
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다.
 * 처음 집과 마지막 집은 이웃이 아니다.
 * <p>
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다.
 * 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
 * <p>
 * 출력
 * 첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
 * <p>
  3
  26 40 83
  49 60 57
  13 89 99
 * <p>
 4
 26 40 83
  49 60 57
  13 89 99
  10 11 12
 * <p>
 * 96
 */
public class p1149_RGB {
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] house = new int[N][3];
        int[][] arr = new int[N][3];
        
        arr[0][RED] = scan.nextInt();
        arr[0][GREEN] = scan.nextInt();
        arr[0][BLUE] = scan.nextInt();
        
        for (int i = 1; i < N; i++) {
            house[i][RED] = scan.nextInt();
            house[i][GREEN] = scan.nextInt();
            house[i][BLUE] = scan.nextInt();

            arr[i][RED] = house[i][RED] + Math.min(arr[i-1][GREEN], arr[i-1][BLUE]);
            arr[i][GREEN] = house[i][GREEN] + Math.min(arr[i-1][RED], arr[i-1][BLUE]);
            arr[i][BLUE] = house[i][BLUE] + Math.min(arr[i-1][RED], arr[i-1][GREEN]);

        }
        for (int c = 0; c < N; c++) {
            System.out.println(Arrays.toString(house[c]));
        }
        System.out.println();   

        for (int c = 0; c < N; c++) {
            System.out.println(Arrays.toString(arr[c]));
        }
        System.out.println();
        
        Arrays.sort(arr[N-1]);
        System.out.println("결과값 : "+arr[N-1][0]);

    }
    
}
