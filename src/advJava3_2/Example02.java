package advJava3_2;

public class Example02 {
    
    static String getFileName(String path) {
    	return (path.substring(path.lastIndexOf("/")+1)); 
    }
    
    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx", 
                       "c:/www/mainpage.html",
                       "c:/program files/java/javac.exe" };
        for (String s : a) {
            String fileName = getFileName(s);
            System.out.println(fileName);
        }
            
    }

}

