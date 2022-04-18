//这是一行注释
/*
这是一个多行注释
这一行也注释了
*/
public class TestDataType {
	public static void main(String[] args) {
		/*
		在java中，变量分成两种类型，一种是基本数据类型，一种是引用
		基本数据类型有四类八种，整数类，小数类，逻辑类型，字符类型
		所有基本数据类型都是存储在静态存储空间中的。
		整数类:byte(1字节)01111111，short(2个字节)，int（4个字节），long（8个字节）
		      默认类型是int  12L，对于byte和short而言，只要进行运算，就会自动转换为int
			  byte b1 = 12; byte b2 = 22; b1 + b2其实是int1
		小数类：float(4个字节),double(8个字节)，默认类型是double 19.2  6.5f
		逻辑类型: boolean --> true false  if(1)这是不对的 !true = false
		字符类型: char 只能存储一个字符使用单引号 char a = 'a'; char = '1'
		hello how are you ASII ->1个字节
		你好 -->GB2312简体字， BIG5-->繁体  ->GBK(简体和繁体) ->4个字节
		unicode --> utf-8
		其实字符类型也是一个数字，所以在进行运算的时候，也会转换为int
		byte,short,char,int在运算的时候都会转换为int


		数据类型的转换:
		1、小类型和大类型运算会自动转换为大类型 
			12.3 + 12  "12"+2-->"122"  2+2+"1"  4+"1" = 41
			12+"1"+2+2 ->12122
		2、如果要把一个大类型的数存储到小类型的值中，必须进行强制类型转换，否则编译报错
		   int a = 12.3 不行，会报错，强制类型转换方式(int)12.3
		*/
		//int a = (int)12.9;
		//System.out.println(a);
		
		byte b1 = 12;
		byte b2 = 22;
		//byte b3 = b1+b2;//会报错
		byte b3 = (byte)(b1+b2);

		//float f = 12.3;//会报错
		float f = 12.3f;
	}
}