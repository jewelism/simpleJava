package advJava3_2;

public class Example05 {
    
    static String removeNonAlphabet(String s) {
    	StringBuilder builder = new StringBuilder();
    	builder.append(s);
    	
    	for(int i=1; i<s.length(); i++){
    		char a = builder.charAt(i);
    		if(!Character.isAlphabetic(a)){
        		builder.deleteCharAt(i);
        	}
    	}
    	return builder.toString(); 
    	
    }
    
    public static void main(String[] args) {
        String s = " a#b.c__d$$$e++++f;;;g...h///i%";
        s = removeNonAlphabet(s);
        System.out.println(s);
    }

}

