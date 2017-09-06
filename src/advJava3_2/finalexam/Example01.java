package advJava3_2.finalexam;

public class Example01 {
    
    public static boolean isNullEmptyBlank(String s) {
    	String result;
    	String r = "[\t\n ]+";
    	if(s==null||s.equals(""))
    		return true;
    	else{
    		result = s.replaceAll(r, "");
    		if(result.equals(null)||result.equals(""))
    			return true;
    		else
    			return false;
    	}
    }

    public static void main(String[] args) {
        String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . "};
        
        for (String s : a) 
            System.out.println(isNullEmptyBlank(s));
    }
}

