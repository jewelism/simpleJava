package codingDojang.lv1;

/**
 * Created by advJava3_2 on 2017. 4. 23..
 * 1차원의 점들이 주어졌을 때,
 * 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)

 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 */
public class p408 {
    public static void main(String[] args) {
        int[] S={1, 3, 4, 8, 13, 17, 20};
        int x=0 ,y=0 ;
        int min=100;
        for(int i=0; i<S.length-1; i++){
            if(S[i+1]-S[i]<min){
                x = S[i];
                y = S[i+1];
                min = S[i+1]-S[i]; 
            }
        }

        System.out.println("결과값 : ("+x+", "+y+")");
    }
}
