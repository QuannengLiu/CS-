/*
public class DataType{

	public static void main(String[] args){
	short s1 = 1;
	s1 = s1 + 1;

	}

}
short与int混合运算时，会先转换成int再算，出现问题

*/

public class DataType01{

	public static void main(String[] args){
	short s1 = 1;
	s1 = (short) (s1 + 1);
	System.out.println(s1);

	char a = '好';
	System.out.println(a);

	}

}
