package advJava3_2;

public class VarArgs2 {
    
    static void print(int a, int... b) {
        System.out.printf("\na=%d, b.length=%d : ", a, b.length);
        for (int i : b)
            System.out.printf("%d ", i);
    }
        
    
    public static void main(String[] args) {
        print(1, 11, 2, 31, 44);
        print(2, 51, 35);
        print(3, 64);
        print(4);

        int[] a = new int[] { 11, 2, 31, 44 };
        print(5, a);
    }

}

