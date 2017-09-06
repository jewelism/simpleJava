package codingDojang.lv1;

/**
 * Created by advJava3_2 on 2017. 4. 2..
 */
public class CamelCase {
    public static void main(String[] args) {
        String a = "codingDojang";
        String b = "numGoat";
        System.out.println(modStr(a));
        System.out.println(modStr(b));
    }

    public static String modStr(String s){
        StringBuilder result = new StringBuilder();
        String[] list = new String[s.length()-1];
        for(int i=0; i<s.length(); i++){
            String tmp = s.substring(i,i+1);
            if(tmp.equals(tmp.toUpperCase())){
                result.append("_"+tmp.toLowerCase());
            }else{
                result.append(tmp);
            }
        }
        return result.toString();
    }
}
