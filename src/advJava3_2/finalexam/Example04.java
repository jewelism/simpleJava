package advJava3_2.finalexam;

import java.util.Date;

public class Example04 {
    
    public static boolean contains(Object[] a, Object obj) {
    	for(Object ob : a){
    		if(ob==null){
    			if(obj==null)
    				return true;
    			return false;
    		}    			
    		if(ob.equals(obj))
    			return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
        Object[] a1 = { "hello", 1, new Date(), new StringBuilder("world") };
        Object[] a2 = { "hello", 1, new Date(), new StringBuilder("world"), null };

        System.out.println(contains(a1, 1));
        System.out.println(contains(a1, "hello"));
        System.out.println(contains(a1, null));
        System.out.println(contains(a1, 3.14));

        System.out.println(contains(a2, 1));
        System.out.println(contains(a2, "hello"));
        System.out.println(contains(a2, null));
        System.out.println(contains(a2, 3.14));
    }

}

