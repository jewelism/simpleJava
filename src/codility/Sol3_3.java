package codility;

public class Sol3_3 {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int size = A.length + 1;
		int sum = 0;
		for (int i = 0; i <= size; i++) {
			sum += i;
		}
		for (int i = 0; i < A.length; i++) {
			sum -= A[i];
		}
		return sum;
	}
}
