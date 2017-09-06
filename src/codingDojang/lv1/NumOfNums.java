package codingDojang.lv1;

import java.util.Arrays;

/**
 * 1~1000에서 각 숫자의 개수 구하기
 * 예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자

 10 = 1, 0
 11 = 1, 1
 12 = 1, 2
 13 = 1, 3
 14 = 1, 4
 15 = 1, 5

 그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
 */
public class NumOfNums {
    public static void main(String[] args) {

        int[] list = new int[10]; //결과를 저장할 배열 10개 선언
        for(int i=1; i<=1000; i++){
            String snum = String.valueOf(i); //int를 String 으로 변환
            for(char c : snum.toCharArray()){ //String에서 글자를 하나씩 꺼내서
                String stmp = Character.toString(c);  //그글자를 다시 String으로 변환해서
                int itmp = Integer.parseInt(stmp);  //String을 int로 다시바꿔서
                list[itmp]++;  //결과 배열에 저장
            }
        }
        System.out.println(Arrays.toString(list));
//        for(int i=1; i<=1000; i++){ //1~1000까지
//            result = i;
//            if(result>=1000){// 숫자가 1000이상일 경우
//                mok = result/1000; //1000으로 나눠서 몫을 구해서(천의자리 숫자를 구해서)
//                list[mok]++; //리스트에 숫자 추가
//                result %= 1000;//1000의자리 숫자를 떼버리고 아래로 이동(?)
//            }
//            if(result>=100){ //숫자가 100이상일 경우
//                mok = result/100;
//                list[mok]++;
//                result %= 100;
//            }
//            if(result>=10){ //숫자가 10이상일 경우
//                mok = result/10;
//                list[mok]++;
//                result %= 10;
//            }
//            if(result>=0){ //숫자가 1이상일 경우
//                mok = result/1;
//                list[mok]++;
//            }
//        }
//        System.out.print("0:"+list[0]+"개, "+"1:"+list[1]+"개, "+"2:"+list[2]+"개, "+"3:"+list[3]+"개, "+"4:"+list[4]+"개, ");
//        System.out.println("5:"+list[5]+"개, "+"6:"+list[6]+"개, "+"7:"+list[7]+"개, "+"8:"+list[8]+"개, "+"9:"+list[9]+"개");
    }
}
