package baekjoon.sort;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by advJava3_2 on 2017. 4. 8..
 * 다솜이는 기타를 많이 가지고 있다. 그리고 각각의 기타는 모두 다른 시리얼 번호를 가지고 있다.
 * 다솜이는 기타를 빨리 찾아서 빨리 사람들에게 연주해주기 위해서 기타를 시리얼 번호 순서대로 정렬하고자 한다.

 모든 시리얼 번호는 알파벳 대문자 (A-Z)와 숫자 (0-9)로 이루어져 있다.

 시리얼번호 A가 시리얼번호 B의 앞에 오는는 경우는 다음과 같다.

 A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
 만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
 만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
 시리얼이 주어졌을 때, 정렬해서 출력하는 프로그램을 작성하시오.

 입력
 첫째 줄에 기타의 개수 N이 주어진다. N은 1,000보다 작거나 같다.
 둘째 줄부터 N개의 줄에 시리얼 번호가 하나씩 주어진다.
 시리얼 번호의 길이는 최대 50이고, 알파벳 대문자 또는 숫자로만 이루어져 있다.
 시리얼 번호는 중복되지 않는다.
 **
 5
 ABCD
 145C
 A
 A910
 Z321
 * **

 출력
 첫째 줄부터 차례대로 N개의 줄에 한줄에 하나씩 시리얼 번호를 정렬한 결과를 출력한다.
 **
 A
 ABCD
 Z321
 145C
 A910
 **
 */
public class p1431_dasom_guitar {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("기타의 갯수를 입력하세요 : ");
//        int N = scan.nextInt();
//        String[] list = new String[N];
//        for(int i=0; i<list.length; i++){ //랜덤배열생성
//            list[i] = generateSessionKey(50);
//        }
        String[] list = {"5","ABCD","145C","A","A910","Z321"}; //문제에서 예시로 준 배열
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        shortFirstSort(list);
        System.out.println(Arrays.toString(list));
    }

//    public static String generateSessionKey(int length){ //랜덤문자열을 생성
//        String alphabet =
//                new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"); //9
//        int n = alphabet.length(); //10
//
//        String result = new String();
//        Random r = new Random(); //11
//
//        for (int i=0; i<r.nextInt(n); i++) //12
//            result = result + alphabet.charAt(r.nextInt(n)); //13
//
//        return result;
//    }

    public static void shortFirstSort(String[] list){ //버블소트로 길이비교&길이가 같으면 숫자더해서 정렬
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++){
                if(list[i].length()==list[j].length()){
                    if(compareIntHelper(list[i])>compareIntHelper(list[j])){ // 숫자합을 비교, 위치 바꿈
                        String tmp = list[i];
                        list[i] = list[j];
                        list[j] = tmp;
                    } else if(compareIntHelper(list[i])==compareIntHelper(list[j])){ //숫자합도 같아서 비교할수없는경우 사전순 정렬
                        String[] tmp = {list[i], list[j]};
                        Arrays.sort(tmp); //zzz귀찮아서 Arrays클래스의 sort이용해서 사전순 정렬후 갖다 박음
                        list[i] = tmp[0];
                        list[j] = tmp[1];
                    }
                }
                else if(list[i].length()>list[j].length()){
                    String tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public static int compareIntHelper(String s){
//        if(!s.matches("[0-9]+")) //문자열에 숫자가 하나도 없을경우
//            return 999999;//무조건 뒤로보내기위해 큰숫자 리턴
        ArrayList<Integer> intList = new ArrayList<Integer>();
        char[] charList = s.toCharArray();
        int tmp = 0;
        for(char c: charList){
            String temp = Character.toString(c);
            if(temp.matches("[0-9]+")){
                intList.add(Integer.parseInt(temp)); //숫자인것만찾아서 리스트에 추가
            }
        }
        for(int k=0; k<intList.size(); k++){
            tmp += intList.get(k); //리스트에있는 숫자들을 다더해서
        }
        return tmp; //리턴
    }
}
