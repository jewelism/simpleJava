package advJava3_2;

public class String03 {
    
    public static void main(String[] args) {
        String s0 = "hello world";
        String s1 = "HELLO WORLD";
        String s2 = s0; //��hello world��
        String s3 = s1.toLowerCase();//��hello world��
        
        boolean b0 = (s0 == s2); //t
        boolean b1 = (s0 == s3); //f
        boolean b2 = s0.equals(s2); //t
        boolean b3 = s0.equals(s3); //t
        System.out.printf("%b %b %b %b\n", b0, b1, b2, b3);
        
        boolean b4 = s0.equals(s1); //f
        boolean b5 = s0.equalsIgnoreCase(s1); //t
        System.out.printf("%b %b\n", b4, b5);
     }
}

