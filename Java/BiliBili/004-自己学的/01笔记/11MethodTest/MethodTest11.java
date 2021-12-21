public class MethodTest11{
	//测试返回值类型不相等，是否报错：按数据类型转换规则来；

	public static void main(String[] args){

		System.out.println(test(10));


	
	}

	public static double test(int a){

		a++;
		return 1;
	
	
	}
}