import org.wlw.test.B;

public class TestB{
	public static void main(String[] args) {
		B b = new B();
//		b.c = 20;//default修饰的属性，出了包就无法访问。
//		b.d = 30;//protected修饰的属性，出了包也无法访问
		b.e = 30;
	}
}
