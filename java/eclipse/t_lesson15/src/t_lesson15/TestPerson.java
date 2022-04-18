package t_lesson15;

public class TestPerson {
	//a是属于整个对象的，需要创建TestPerson对象之后才能使用 TestPerson tp = new TestPerson() tp.a=x
	//int a = 10;
	
	static int a = 10;
	
	public static void main(String[] args) {
		Person p1 = new Person("菜10");
		p1.read();
		new Person("老张");
		
		a = 10;
	}
}

class Person {
	String name;
	//构造对象的时候，首先执行的代码
	Book book = new Book("浪潮之巅");
	
	public Person(String name) {
		this.name = name;
		//属性初始化完成之后才调用构造方法
		System.out.println(name+"被成功创建!");
	}
	
	public void read() {
		System.out.println(this.name+"正在读:"+this.book.name);
	}
	//也是属性，也会在构造的时候执行
	static Book book2 = new Book("文明之光");
}

class Book {
	String name;
	
	public Book(String name) {
		this.name = name;
		System.out.println("创建了一本书:"+this.name);
	}
}
