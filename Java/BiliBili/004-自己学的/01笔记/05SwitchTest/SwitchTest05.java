public class SwitchTest05
{

	public static void main(String[] args){
	//欢迎
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("欢迎使用本系统！本系统用于查询考生成绩等级。");
	//输入成绩
	System.out.print("请输入您的成绩：");
	double score = s.nextDouble();
	//计算成绩等级
	int grade = (int)(score/10);
	//switch语句判断成绩级别
	switch (grade)
	{
	case 9 :case 10 :
			System.out.println("您的级别为A");
			break;

	case 8 :
			System.out.println("您的级别为B");
			break;

	case 7 :
			System.out.println("您的级别为C");
			break;

	case 6 :
			System.out.println("您的级别为D");
			break;
	
	case 5 :case 4 :case 3 :case 2 :case 1 :case 0 :
			System.out.println("您的级别为E");
			break;
	
	default :
			System.out.println("对不起，您输入的数值不合法！");
			break;	
	}
	}
}