package codingDojang.lv2;

public class LongestSubStr {
    public static void main(String[] args) {
        String a = "photography";
        String b = "autograph";

        System.out.println(Finder(a,b));
    }

    public static String Finder(String a, String b){
        boolean flag = true;
        String result = "";
        String sa;
        String sb;
        int len=0;
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++) {
                sa = a.substring(i, i + 1);
                sb = b.substring(j, j + 1);
                if (sa.equals(sb)) {
                    i++;
                    if(flag==true){ //매칭되는 첫글자 발견! 문자열길이와 문자열을 초기화시켜야한다.
                        len = 0;
                        result = "";
                    }
                    len++;
                    result += sa;
                    flag = false;
                } else { //같지않다는것은 이어지는문자열이 끝난것이거나 그냥 매칭이안된것이기때문에
                    flag = true;
                }
            }
        }
        System.out.println(len);
        return result;
    }
}
