/*

1) ��ü �迭 (Exercise1.java)

���� ���� �ϴ� �ڵ带 �����϶�.

static memeber variable�� Object[] �迭�� ������.

static void addData(int count) �޼ҵ带 �����϶�.
�迭�� 0 ���� count-1 ���� ������ �־��.
���� �ϳ��� �迭�� ���� ��, Integer ��ü �ϳ��� String ��ü �ϳ��� �־��.
   ( ��: new Integer(3), String.valueOf(3) )
�� ���� �ϳ��� ��ü �� ���� �迭�� �ִ´�.
���� �迭�� ũ��� count * 2 �̾�� �Ѵ�.

static int findIndex(int value) �޼ҵ带 �����϶�.
�Ķ���ͷ� ���޵� value ���� �ش��ϴ� Integer ��ü�� �迭���� ã�Ƽ� 
�� ��ġ(index)�� �����϶�.

static int findIndex(String value) �޼ҵ带 �����϶�.
�Ķ���ͷ� ���޵� String ��ü�� ������ ���� String ��ü�� �迭���� ã�Ƽ�
�� ��ġ(index)�� �����϶�.

 */

package advJava3_2;

public class Exercise01 {
	static Object[] arr;

	static void addData(int count) {
		for (int i = 0; i < count; i += 2) {
			arr[i] = (Object) (new Integer(i));
			arr[i + 1] = (Object) (new String(String.valueOf(i + 1)));
		}
	}

//	static int findIndex(int value) {
//		
//		return;
//	}
//
//	static String findIndex(String value) {
//		
//		return;
//	}

	public static void main(String[] args) {
		int count = 10;
		addData(count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
