package advJava3_2;

public class Example03 {
    
    static String toString(String[] a) {
    	StringBuilder sb = new StringBuilder();
    	String tmp="";
    	sb.append('{');
    	for(String s : a){
    		if(sb.length() > 1) sb.append(", ");
    		sb.append('"');
    		sb.append(s);
    		sb.append('"');
    	}
    	sb.append('}');
    	tmp = sb.toString();
    	return tmp;
    }
    
    public static void main(String[] args) {
        String[] a = { "one", "two", "three", "four" };
        String s = toString(a);
        System.out.println(s);
    }
}