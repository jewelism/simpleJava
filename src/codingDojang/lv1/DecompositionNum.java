package codingDojang.lv1;

/**
 * 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
 * 예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.
 *
 * 10 = 1 * 0 = 0
 * 11 = 1 * 1 = 1
 * 12 = 1 * 2 = 2
 * 13 = 1 * 3 = 3
 * 14 = 1 * 4 = 4
 * 15 = 1 * 5 = 5
 *
 * 그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15
 */
public class DecompositionNum {
    public static void main(String[] args) {
        int result = 0; //최종 합계
        for(int i=10; i<=1000; i++) {
            int tmpResult = 1; //곱셈한것을 저장할 변수
            String snum = String.valueOf(i); //int를 String 으로 변환
            for (char c : snum.toCharArray()) { //String에서 글자를 하나씩 꺼내서
                String stmp = Character.toString(c);  //그글자를 다시 String으로 변환해서
                int itmp = Integer.parseInt(stmp);  //String을 int로 다시바꿔서
                tmpResult *= itmp; //숫자의 곱셈을 저장
            }
            result += tmpResult; //곱셈한것들끼리 합
        }
        System.out.println(result);
//        }
//        int sum = 0;
//        int[] mok = new int[4];
//        int result = 0;
//        for (int i = 10; i <= 1000; i++) { //i=10~1000
//            String s = String.valueOf(i); //자릿수를 구하기위해.
//            result = i;
//            if (result >= 1000) { //i가 1000이상인경우
//                mok[3] = result / 1000;
//                result %= 1000;
//            }
//            if (result >= 100) {
//                mok[2] = result / 100;
//                result %= 100;
//            }
//            if (result >= 10) {
//                mok[1] = result / 10;
//                result %= 10;
//            }
//            if (result >= 1) {
//                mok[0] = result / 1;
//            }
//
//            if (s.length() == 4) { //4자릿수이상
//                sum += mok[3] * mok[2] * mok[1] * mok[0];
//            } else if (s.length() == 3) {
//                sum += mok[2] * mok[1] * mok[0];
//            } else if (s.length() == 2) {
//                sum += mok[1] * mok[0];
//            }
//        }
//        System.out.println("총합 : " + sum);
    }
}