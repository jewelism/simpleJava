package advJava3_2;

import java.util.Random;

public class Example01 {
    
    static Random random = new Random();
    
    static int[] makeIntArray(int count) {
        int[] a = new int[count];
        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(10000);
        return a;
    }

    static double[] makeDoubleArray(int count) {
        double[] a = new double[count];
        for (int i = 0; i < count; ++i)
            a[i] = random.nextDouble() + random.nextInt(100);
        return a;
    }
    
    static String makeRandomString() {
        StringBuilder builder = new StringBuilder();
        int size = random.nextInt(3) + 3;
        for (int i=0; i < size; ++i) {
            int n = random.nextInt(26) + (int)'a';
            builder.append((char)n);
        }
        return builder.toString();
    }
    
    static String[] makeStringArray(int count) {
        String[] a = new String[count];
        for (int i = 0; i < count; ++i)
            a[i] = makeRandomString();
        return a;
    }
    
    public static void main(String[] args) {
        int length = random.nextInt(5) + 5;
        int[] a1 = makeIntArray(length);
        double[] a2 = makeDoubleArray(length);
        String[] a3 = makeStringArray(length);
        
        System.out.println("       int     double     String");
        System.out.println("---------- ---------- ----------");
        String s="";
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
        s = String.format("%10d%11f%11s\n", a1[random.nextInt(5)], a2[random.nextInt(5)] , a3[random.nextInt(5)]);
        System.out.print(s);
    }

}

