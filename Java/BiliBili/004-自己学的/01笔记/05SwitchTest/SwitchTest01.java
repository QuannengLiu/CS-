/*
public class SwitchTest01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int num = s.nextInt();

		switch (num)
		{
		case 1 :
			System.out.println("今天是星期一");
			break;
		case 2 :
			System.out.println("今天是星期二");
			break;
		case 3 :
			System.out.println("今天是星期三");
			break;
		case 4 :
			System.out.println("今天是星期四");		
			break;
		case 5 :
			System.out.println("今天是星期五");
			break;		
		case 6 :
			System.out.println("今天是星期六");
			break;
		case 7 :
			System.out.println("今天是星期日");
			break;
		default:
			System.out.print("对不起，您输入的数字非法！");
		}
System.out.println("------------------------------------------------");
		//case穿透
		switch (num)
		{
		case 1 :
			System.out.println("今天是星期一");
		case 2 :
			System.out.println("今天是星期二");
		case 3 :
			System.out.println("今天是星期三");
			break;
		case 4 :
			System.out.println("今天是星期四");		
			break;
		case 5 :
			System.out.println("今天是星期五");
			break;		
		case 6 :
			System.out.println("今天是星期六");
			break;
		case 7 :
			System.out.println("今天是星期日");
			break;
		default:
			System.out.println("对不起，您输入的数字非法！");
		}
System.out.println("------------------------------------------------");
		//case合并

		switch (num)
		{
		case 1 : case 2 :  case 3 :
			System.out.println("今天是星期三");
			break;
		case 4 :
			System.out.println("今天是星期四");		
			break;
		case 5 :
			System.out.println("今天是星期五");
			break;		
		case 6 :
			System.out.println("今天是星期六");
			break;
		case 7 :
			System.out.println("今天是星期日");
			break;
		default:
			System.out.println("对不起，您输入的数字非法！");
		}
	}
}
*/
public class SwitchTest01{
	public static void main(String[] args){

		double data = 2;

		switch (data)
		{
		case 1 :
			System.out.println("今天是星期六");
			break;
		case 2 :
			System.out.println("没问题");
			break;
		default:
			System.out.println("对不起，您输入的数字非法！");
		}
	}
}