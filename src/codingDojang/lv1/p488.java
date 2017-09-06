package codingDojang.lv1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by advJava3_2 on 2017. 4. 23..
 
 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.

 sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
 sample outputs: true false false true false
 
 */
public class p488 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] list = input.toCharArray();
        Arrays.sort(list);
        String compare = String.copyValueOf(list);
        System.out.println(compare);
        if(compare.equals("0123456789"))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
