package advJava3_2;

import java.util.Calendar;


public class DateTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String ntime = String.valueOf(c.get(Calendar.YEAR));
		int a = Integer.parseInt(ntime);
		int b = 2016; //2000�⵵�� 1���� ��������
		int gisu = a-b+1;
		System.out.println(gisu);
	}
}
