public class MethodTest08{
	//返回值不为空时；

	public static void main(String[] args){

		//对返回值再重新赋值后打印
		/*int numDivide = numInt(18, 2);
		System.out.println("answer is ---------->" + numDivide);
		*/

		//直接打印出返回值
		System.out.println("answer is ---------->" + numInt(18, 2));
	
	}

	public static int numInt(int dividend, int divisor){

		//结果重新赋值后再返回
		/*
		int numDivide = dividend / divisor;
		return numDivide;
		*/

		//直接返回结果
		return dividend / divisor;
	
	}

}