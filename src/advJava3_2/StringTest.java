package advJava3_2;

public class StringTest {
	public static void main(String[] args) {
		int a = "010-1234-5678".indexOf("-");
		System.out.println("010-1234-5678".substring(0,3));
		StringBuilder sbb = new StringBuilder("010-1234");
		sbb.insert(8, "-");
		System.out.println(sbb);
		String s = "010-1234-5678";
		System.out.println(s.substring(2));
		
		
		if(!s.substring(3).equals("-")){
			StringBuilder sb = new StringBuilder(s);
			sb.insert(3, "-");
			if(sb.length()==11)
				sb.insert(7, "-");
			else
				sb.insert(8, "-");
			s = sb.toString();
		}
		System.out.println(s);
	}
}
