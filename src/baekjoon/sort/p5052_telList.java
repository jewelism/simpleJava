package baekjoon.sort;

/**
 * Created by advJava3_2 on 2017. 4. 8..
 *
 * 전화번호 목록이 주어진다. 이 때, 이 목록이 일관성이 있는지 없는지를 구하는 프로그램을 작성하시오.

 전화번호 목록이 일관성을 유지하려면, 한 번호가 다른 번호의 접두어인 경우가 없어야 한다.

 예를 들어, 전화번호 목록이 아래와 같은 경우를 생각해보자

 긴급전화: 911
 상근: 95 625 999
 선영: 91 12 54 26
 이 경우에 선영이에게 전화를 걸 수 잇는 방법이 없다.
 전화기를 들고 선영이 번호의 처음 세 자리를 누르는 순간 바로 긴급전화가 걸리기 때문이다.
 따라서, 이 목록은 일관성이 없는 목록이다.

 **입력
 첫째 줄에 테스트 케이스의 개수 t가 주어진다. (1 ≤ t ≤ 50)
 각 테스트 케이스의 첫째 줄에는 전화번호의 수 n이 주어진다.(1 ≤ n ≤ 10000)
 다음 n개의 줄에는 목록에 포함되어 있는 전화번호가 하나씩 주어진다.
 전화번호의 길이는 길어야 10자리이며, 목록에 있는 두 전화번호가 같은 경우는 없다.

 **출력
 각 테스트 케이스에 대해서, 일관성 있는 목록인 경우에는 YES, 아닌 경우에는 NO를 출력한다.

 2
 3
 911
 97625999
 91125426
 5
 113
 12340
 123440
 12345
 98346

 NO
 YES
 */
public class p5052_telList {
    public static void main(String[] args) {
        int t = 2;
        int n = 3;
        String[] list = new String[n];
        list[0] = "911";
        list[1] = "97625999";
        list[2] = "91125426";
        System.out.println(chkConsistency(n, list));
        n = 5;
        list = new String[n];
        list[0] = "113";
        list[1] = "12340";
        list[2] = "123440";
        list[3] = "12345";
        list[4] = "98346";
        System.out.println(chkConsistency(n, list));
    }

    public static String chkConsistency(int n, String[] list){
        String tmp1 = "";
        String tmp2 = "";
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++){
                int shortLen = shorterLen(list[i],list[j]);
                tmp1 = list[i].substring(0, shortLen);
                tmp2 = list[j].substring(0, shortLen);
                if(tmp1.equals(tmp2)){
                    System.out.println(list[i]+"/"+list[j]);
                    System.out.println(tmp1+"/"+tmp2);
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static int shorterLen(String s1, String s2){ //두 문자열중 짧은 길이를 리턴
        if(s1.length()<s2.length())
            return s1.length();
        return s2.length();
    }
//    public static String chkConsistency(int n, String[] list){
//        //int shortest = shortestLen(list); //가장짧은길이를 리턴
//        String[] tmpList = new String[list.length];
//        for(int i=0; i<list.length; i++){
//            tmpList[i]=list[i].substring(0,shortest);
//        }
//        for(int i=0; i<tmpList.length; i++){
//            for(int j=1; j<tmpList.length; j++){
//                if(tmpList[i]==tmpList[j])
//                    return "NO";
//            }
//        }
//        System.out.println(Arrays.toString(tmpList));
//        return "YES";
//    }

//    public static int shortestLen(String[] list){
//        int shortest = list[0].length(); //첫번째것이 가장짧다고 가정하자
//        for(int i=0; i<list.length; i++){
//            if(shortest>list[i].length()){
//                shortest = list[i].length();
//            }
//        }
//        return shortest;
//    }
}
