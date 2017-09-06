package codility;

public class Sol1 {
    public int solution(int N) {
        // write your code in Java SE 8
        int c=0, max=0;
        String binary = Integer.toBinaryString(N);
        for(int i=0; i<binary.length(); i++){
            char ch = binary.charAt(i);
            if (ch=='0'){
                c++;    
            } else {
                if(c>max)
                    max=c;
                c=0;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
		Sol1 s = new Sol1();
		System.out.println(s.solution(1041));
	}
}