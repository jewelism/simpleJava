package advJava3_2;

public class Fraction {

	private int numerator; // ����
	private int denominator; // �и�

	Fraction(int numerator, int denominator) {
		int gcd = greatestCommonDivisor(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", numerator, denominator);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Fraction) == false)
			return false;
		Fraction p = (Fraction) obj;
		return p.denominator==this.denominator&&p.numerator==this.numerator;
	}

	public static Fraction add(Fraction f1, Fraction f2) {
		return new Fraction((f1.numerator*f2.denominator)+(f2.numerator*f1.denominator), f1.denominator*f2.denominator);
	}

	public static Fraction subtract(Fraction f1, Fraction f2) {
		int result = (f1.numerator*f2.denominator)-(f2.numerator*f1.denominator);
		if(result<0) result*=-1;
		return new Fraction(result, f1.denominator*f2.denominator);
	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		return new Fraction(f1.numerator*f2.numerator, f1.denominator*f2.denominator);
	}

	public static Fraction divide(Fraction f1, Fraction f2) {
		return new Fraction(f1.numerator*f2.denominator, f1.denominator*f2.numerator);
	}

	public static int greatestCommonDivisor(int x, int y) { // �ִ��������ϱ�
		return y == 0 ? x : greatestCommonDivisor(y, x % y);
	}

	public static void main(String[] argv) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(2, 3);

		System.out.printf("%s �� %s = %s\n", f1, f2, Fraction.add(f1, f2));
		System.out.printf("%s �� %s = %s\n", f1, f2, Fraction.subtract(f1, f2));
		System.out.printf("%s �� %s = %s\n", f1, f2, Fraction.multiply(f1, f2));
		System.out.printf("%s �� %s = %s\n", f1, f2, Fraction.divide(f1, f2));

		System.out.println(Fraction.add(f1, f2).equals(new Fraction(7, 6)));
		//System.out.println(f1 instanceof Fraction);
	}
}
