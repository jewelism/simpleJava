package codility;

public class Sol4_2 {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int sum=0;
		int sumi=0;
		if(A.length==0||A==null)
			return 1;
		for(int i=0; i<A.length; i++){
			sum += A[i];
			sumi += i+1;
		}
		if(sum==sumi){
			return 1;
		} else{
			return sum-sumi;
		}
    }
}
