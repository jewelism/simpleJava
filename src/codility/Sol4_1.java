package codility;

import java.util.Arrays;

public class Sol4_1 {
	public static int solution(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
		for(int i=1; i<A.length; i++){
			if(A[i]-A[i-1]==2)
				return A[i]-1;
		}
		return A[A.length];
    }
	
	public static void main(String[] args) {
		int[] A = {1,1,2,4,5,6,7,8};
		System.out.println(solution(A));
	}
}
