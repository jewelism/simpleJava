package advJava3_2;

class Person{
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class Example04 {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object list[] = new Object[3];
		Object list2[] = new Object[3];
		Object list3[]  = new Object[2];
		double[] il = new double[3];
		list[0] = il[0];
		list[1] = list2[0];
		list2[0] = "a";
		list2[1] = "b";
		list2[2] = "c";
		
		il[0] = 1.1;
		il[1] = 2.2;
		il[2] = 3.3;
		
		list3[0] = new Person("�Ӳ���",22);
	}
}
