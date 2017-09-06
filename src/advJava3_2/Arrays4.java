package advJava3_2;

import java.util.Arrays;
import java.util.List;

public class Arrays4 {
    
    static void printList(List<String> list) {
        for (String s : list)
            System.out.printf("%s ", s);
        System.out.println();
    }
    
    public static void main(String[] args) {
        String[] a = { "one", "two", "three" };
        List<String> list1 = Arrays.asList("one", "two", "three");
        List<String> list2 = Arrays.asList(a);
        
        printList(list1);
        printList(list2);
        
        System.out.println(list1.toString()+"onee");
        System.out.println(list2.toString()+"twoo");
        
        Object[] b = list1.toArray();
        String[] c = (String[])list1.toArray();
        System.out.printf("Arrays.equals(a,  b): %b\n", Arrays.equals(a,  b));
        System.out.printf("Arrays.equals(a,  c): %b\n", Arrays.equals(a,  c));
        System.out.printf("a == b: %b\n", a == b);
        System.out.printf("a == c: %b\n", a == c);
        System.out.printf("b == c: %b\n", b == c);
    }

}
