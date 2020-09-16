package chapter08;

public class DefaultMethodEx {

	public static void main(String[] args) {
		MyInterface mi1 =  new MyClassA();
		mi1.method1();
		
		MyInterface mi2 = new MyClassA();
		mi2.method1();
		mi2.method2();

	}

}
