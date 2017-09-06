package advJava3_2.finalexam;

import java.util.ArrayList;
import java.util.Arrays;

public class Example08 {
    
    static String[] intersection(String[] a, String[] b) {
    	ArrayList<String> list = new ArrayList<String>();
    	for(String s : a){
    		for(String s2 : b){
    			if(s.equals(s2)){
    				list.add(s);
    			}
    		}
    	}
    	String[] simpleArray = new String[ list.size() ];
    	return list.toArray( simpleArray );
    }

    public static void main(String[] args) {
        String[] a = { "1", "3", "4", "6", "8", "9" };
        String[] b = { "0", "2", "4", "6", "8", "10" };
        String[] c = intersection(a, b);
        System.out.println(Arrays.toString(c));
    }
}

