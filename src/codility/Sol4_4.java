package codility;

public class Sol4_4 {
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int[] counter = new int[N];
		for(int i: counter)
			counter[i]=0;
		for(int i : A){
			if(A[i]==N+1){
				for(int j=0; j<counter.length; j++)
					counter[j]++;
			} else
				counter[A[i]]++;
		}
		return counter;
    }
	public static void main(String[] args) {
		Sol4_4 s = new Sol4_4();
		int[] arr = {3,4,4,6,1,4,4};
		arr = s.solution(5, arr);
		System.out.println(arr.toString());
		
	}
}
