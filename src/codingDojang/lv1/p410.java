package codingDojang.lv1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by advJava3_2 on 2017. 4. 23..
 
 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
 김씨와 이씨는 각각 몇 명 인가요?
 "이재영"이란 이름이 몇 번 반복되나요?
 중복을 제거한 이름을 출력하세요.
 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 
 */
public class p410 {
    public static void main(String[] args) {
        String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        String[] list = input.split(",");
        char c = '정';
        int numsOfKim = 0;
        int numsOfLee = 0;
        int numsOfLeeJaeYoung = 0;
        for(String s : list){
            char[] clist = s.toCharArray();
            if(clist[0]=='김'){
                numsOfKim++;
            } else if(clist[0]=='이'){
                numsOfLee++;
            }
        }
        System.out.println("김씨 : "+numsOfKim+"명");
        System.out.println("이씨 : "+numsOfLee+"명");
        
        for(int i=0; i<list.length; i++){
            if(list[i].equals("이재영")){
                numsOfLeeJaeYoung++;
            }
        }
        System.out.println("이재영 : "+numsOfLeeJaeYoung+"번");
        Arrays.sort(list);
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        
        ArrayList<String> arrList = new ArrayList<String>();
        for(String s:list){
            arrList.add(s);
        }
        for(int k=0; k<arrList.size(); k++){
            for(int i=0; i<arrList.size(); i++){
                for(int j=i+1; j<arrList.size(); j++){
                    if(arrList.get(i).equals(arrList.get(j))){
                        arrList.remove(j);
                    }
                }
            }    
        }
        
        for(String s: arrList){
            System.out.print(s+" ");
        }
    }
}
