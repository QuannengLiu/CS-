public class DataTypeTest01
{
	public static void main(String[] args){
		char c = 'a';
		System.out.println(c);
		
		char x = '国';
		System.out.println(x);
		System.out.println('\\');
		System.out.println('\u4e2d');
		System.out.println('\u56fd');

		/*
		char c = 'ab';
		System.out.println(c);
		这样会报错，因char是字符，‘ab'是字符串；

		char c = ”a“;
		System.out.println(c);
		这样会报错，因char是字符，”a“是字符串；

		char x = '中国';
		System.out.println(x);
		这样会报错，因char是字符，最多有两个字节，而’中国‘是4个字节
		*/




	

	
	}
}