package codility;

import java.util.Arrays;

public class Sol4_3 {
	public static int solution(int[] A){
		Arrays.sort(A);
		int cnt=1;
		if(A.length<2)
			return 1;
		for(int i : A){
			if(cnt == i)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] A = {1,3,6,4,1,2};
		System.out.println(solution(A));
	}
}
