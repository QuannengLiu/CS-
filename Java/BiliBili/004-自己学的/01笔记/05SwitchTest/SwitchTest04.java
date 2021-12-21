/*
public class SwitchTest04{


	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("欢迎使用简单计算器系统！");

		System.out.print("请输入第一个数据：");

		int firstData = s.nextInt();

		System.out.print("请输入运算符：");

		String operator = s.next();

		System.out.print("请输入第二个数据：");

		int secondData = s.nextInt();

		int calculationResults = 0;

		switch (operator)
		{
		
		case "+":
			calculationResults = firstData + secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "-":
			calculationResults = firstData - secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "*":
			calculationResults = firstData * secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "/":
			calculationResults = firstData / secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "%":
			calculationResults = firstData % secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		default :
			System.out.print("对不起，您输入的数据有误！");	
		
		}

	}
}
*/

/*
下面是老师写的，有几点值得学习：
1、见名知意：如“把firstData换成num1”;
2、注释多：如运算输出由“1+1=2”，改为“运算结果为：1+1=2”；
3、排版整齐：如”成套“的几句话与其他话留出空格；
*/

public class SwitchTest04{


	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器系统！本系统仅支持整数之间的加减乘除取余运算。");

		System.out.print("请输入第一个数据：");
		int num1 = s.nextInt();

		System.out.print("请输入运算符：");
		String operator = s.next();

		System.out.print("请输入第二个数据：");
		int num2 = s.nextInt();

		int result = 0;
		switch (operator)
		{
		
		case "+":
			result = num1 + num2;
			System.out.print("运算结果为：" + num1 + operator + num2 + "=" + result );
			break;

		case "-":
			result = num1 - num2;
			System.out.print( "运算结果为：" + num1 + operator + num2 + "=" + result );
			break;

		case "*":
			result = num1 * num2;
			System.out.print( "运算结果为：" + num1 + operator + num2 + "=" + result );
			break;

		case "/":
			result = num1 / num2;
			System.out.print( "运算结果为：" + num1 + operator + num2 + "=" + result );
			break;

		case "%":
			result = num1 % num2;
			System.out.print( "运算结果为：" + num1 + operator + num2 + "=" + result );
			break;

		default :
			System.out.print("对不起，您输入的数据有误！");			
		}

	}
}