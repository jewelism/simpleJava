package codingDojang.lv1;
import java.util.Scanner;

/**
 * 완전수 구하기!
 * 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다.
 * 예를 들면, 6과 28은 완전수이다.
 * 6=1+2+3 // 1,2,3은 각각 6의 약수 28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수

 입력으로 자연수 N을 받고, 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라.
 **/
public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0; //약수들의 합
        System.out.print("자연수 n을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();//입력을받고
        for(int i=1; i<=input; i++){ //입력한값 이하의(1~입력값) 모든 완전수를 출력하기위해서..
            for(int j=1; j<=i; j++){  //약수를구해서
                if(i%j==0&&i!=j){ //나눠서 나머지가 없고 자기자신이 아닐경우
                    sum += j;
                }
            }
            if(sum==i){ //합계와 입력값을 비교해서 같으면 출력
                System.out.println(i+"는 완전수입니다");
                System.out.println(i+"의 자기자신을 제외한 약수들의 합 : "+sum);
            } else {
                //System.out.println(i+"는 완전수가 아닙니다");
            }
            sum = 0; //약수들의 합 초기화
        }
    }
}
