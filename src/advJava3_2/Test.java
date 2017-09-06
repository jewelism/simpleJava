package advJava3_2;

public class Test {
	public static int num;

	public static void main(String[] args) {
		int tmp = 10;
		int cnt = 21;
		System.out.println("몫 : "+cnt/tmp);
		System.out.println("나머지 : "+cnt%tmp);
	}
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.num = 1;
//		Test t2 = new Test();
//		t2.num = 2;
//		System.out.println(t.num);
//		System.out.println(t2.num);
//		String s = "보석 ㅃ ";
//		// s = s.trim();
//		System.out.println(s);
//		System.out.println(modPhone("1"));
//	}

	public static String modPhone(String searchtxt) { // -를 빼먹고 검색하는경우 -를 삽입하는
		// modPhone메소드
		if (searchtxt.length() >= 3) { // 우선3개 이상입력을 받은경우
			StringBuilder sb = new StringBuilder(searchtxt);
			if (sb.length() == 3) {
				return sb.toString();
			} else if (!searchtxt.substring(3, 4).equals("-")) {
				sb.insert(3, "-"); // -를 삽입
				if (sb.substring(0, 3).equals("010")) {
					if (sb.length() > 7)
						sb.insert(8, "-");
				} else { // 010을 이 아니면(019-111-2222처럼 폰번호가 10자리)
					if (sb.length() > 6)
						sb.insert(7, "-");
				}
				return sb.toString();
			} else {
				return sb.toString();
			}
		} else { // 2자리이하 입력을 받은경우는 그냥 모든사용자를 보여준다
			return "01";
		}
	}
}
