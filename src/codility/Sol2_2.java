/*
 * 

A non-empty zero-indexed array A consisting of N integers is given.
The array contains an odd number of elements, 
and each element of the array can be paired with another element that has the same value, 
except for one element that is left unpaired.
N ���� ������ �̷���� ��� ���� ���� ���� �ε��� �迭 A�� �־��� �ֽ��ϴ�.
�迭 ����� Ȧ���� �����ϰ�
�迭�� �� ��Ҵ� ���� ���� ������ �ٸ� ��ҿ� ���� �� �� �ֽ��ϴ�
¦ �����ִ� �ϳ��� ��Ҹ� �����ϰ�.
For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.

Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, 
returns the value of the unpaired element.
����, ��� ������ �����ϴ� N ���� ������ �迭�� ������,
¦�������� ���� ����� ���� ��ȯ�մϴ�.
For example, given array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
the function should return 7, as explained in the example above.
Assume that:
N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
N�� [1..1,000,000]�� ������ Ȧ���� �����Դϴ�.
�迭 A�� �� ��Ҵ� [1..1,000,000,000] ������ �����Դϴ�.
��ΰ� A�� �� �� �ϳ��� ¦�� �� �߻��մϴ�
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), 
beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 *
 */


package codility;

class Testt{
	int a;
	int b;
	int c;
	public Testt(int a){
		this.a = a;
	}
	
	int am(){
		return 0;
	}
	void bm(){
		
	}
}

public class Sol2_2 {
	
	
	public static void main(String[] args) {
//		int[] a = new int[]{3,2,0,0};
//		String[] b = new String[]{"A","B",null,"C"};
		//Arrays.fill(a, 12);
//		Arrays.sort(b);
//		
//		System.out.println(Arrays.toString(b));
//		String c = "[A, B, null, C]";
//		char[] d = c.toCharArray();
//		String i1 = String.valueOf(123);
//		System.out.println(i1);
//		
//		Testt a = new Testt(1);
//		System.out.println(a.toString());
//		
//		Object b = "B";
//		String s = "";
//		System.out.println(s instanceof CharSequence);
		
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		Integer[] c = new Integer[]{1,2,3};
		Integer[] d = new Integer[]{1,2,3};
		System.out.println(c.equals(d));
//		
//		for(int i = 0; i<d.length; i++){
//			//System.out.println(Arrays.hashCode(a));
//			System.out.print(d[i]);
//		}
//		
//		int a = "AB".compareTo("BA");
//		System.out.println(a);
//		String.format(format, args)
	}
}
