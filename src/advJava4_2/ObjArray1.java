package advJava4_2;

import java.util.Arrays;

public class ObjArray1 {
    static int[] a;
    static int[] b;

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof int[])) return false;
        System.out.println("123");
        return Arrays.equals((int[])obj, a);
    }

    public static void main(String[] args) {
        a = new int[]{1, 2, 3};
        b = new int[]{1, 2, 3};
        String[] c = new String[]{"one", "two", "three"};
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(Arrays.equals(a,b));
        System.out.println(a.equals(b));
        System.out.println(new Integer(3)==3);
    }
}