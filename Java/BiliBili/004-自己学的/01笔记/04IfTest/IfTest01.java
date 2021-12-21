/*
//第一次写的
public class OperatorTest01{
	public static void main(String[] args){
		//五公里之内有肯德基，则去肯德基吃饭。
		double distance = 4.0;
		if (distance <= 5.0)
		{
			System.out.println("去吃饭");//单位km
		}else System.out.println("不去吃饭");


	
	}
}


*/

/*
public class OperatorTest01{

	public static void main(String[] args){
	
	int score = -5;
	String grade = "对不起，您输入的成绩不合法！";
	
	if (score < 0 || score > 100)
	{
	}
	else if(score >= 90 )
		grade = "您的等级为：A。";
	else if(score >= 80 )
		grade = "您的等级为：B。";
	else if(score >= 70 )
		grade = "您的等级为：C。";
	else if(score >= 60 )
		grade = "您的等级为：D。";
	else grade = "您的等级为：E。";


	System.out.println(grade);
	}
}
*/

public class IfTest01{

	public static void main(String[] args){
	
	int score = 30;
	String grade = "对不起，您输入的成绩不合法！";
	
	if (score < 0 || score > 100)
	{
	}else if(score >= 90 ){
		grade = "您的等级为：A。";
	}else if(score >= 80 ){
		grade = "您的等级为：B。";
	}else if(score >= 70 ){
		grade = "您的等级为：C。";
	}else if(score >= 60 ){
		grade = "您的等级为：D。";
	}else grade = "您的等级为：E。";

	System.out.println(grade);
	}
}