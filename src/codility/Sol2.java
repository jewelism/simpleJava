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

import java.util.HashMap;

public class Sol2 {
	public int solution(int[] A) {

		return 0;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0;
		Loop: {
			System.out.println(i+"��°Loop");
			double rand = Math.random() * 10+1;// 0 6��
			int index = (int) rand;
			
			System.out.println("�ʱⰪ / i:0 / index:" + index);

			if (i == index) {
				while (i == index) {
					System.out.println("if�� / i:" + i + " / index:" + index);
					rand = Math.random() * 10+1;// 0 6��
					index = (int) rand;
					System.out.println("������ / i:" + i + " / index:" + index);
				}
			}
			while (i < index) {
				double range = Math.random() * 100+1;// 0 9��
				if (map.get(i) == null) {
					if (map.get(index) == null) {
						map.put(i, (int) range);
						map.put(index, (int) range);
						System.out.println("A[" + i + "] : " + (int) range);
						System.out.println("A[" + index + "] : " + (int) range);

					} else {

						continue;
					}
				} else {
					continue;
				}
				i++;
			}
		}
	}
}
