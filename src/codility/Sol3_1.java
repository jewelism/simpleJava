package codility;

public class Sol3_1 {
	public int solution(int[] A, int P) {
		int result = 0;
		int size = A.length;
		int left = 0;
		int right = 0;
		for(int i=0; i<P; i++){
			left += A[i];
		}
		for(int i=P; i<size; i++){
			right += A[i];
		}
		result = Math.abs(left-right);
		return result;
	}
}
