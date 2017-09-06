package advJava3_2;

public class String02 {
    
    static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }
    
    public static void main(String[] args) {
        String s0 = "hello world";
        String s1 = s0.substring(0, 5);
        String s2 = s0.substring(6);
        String s3 = s1 + " " + s2;
        String s4 = s0.toUpperCase();
        System.out.printf("%s %s %s %s\n", s1, s2, s3, s4);
        
        swap(s1, s2);
        System.out.printf("%s %s\n", s1, s2);
     }
}

