/*
public class IfTest03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("您好，欢迎您使用此系统");
		System.out.println("请您输入一些信息，不要不识抬举");
		System.out.println("0表示晴天，1表示下雨");
		int weather = s.nextInt();
		System.out.println("请您输入一些信息，不要不识抬举");
		System.out.println("0表示女，1表示男");
		int sex = s.nextInt();
		if (weather == 0)
		{
			System.out.println("请您输入当前温度，不要不识抬举");
			int Temperture = s.nextInt();
			if (Temperture > 30)
			{
				if (sex == 0)
				{
					System.out.println("擦防晒霜");
				}
				else
				{
					System.out.println("戴眼镜");
				}

			}else{
				System.out.println("什么也不带");

			}

		}else{
			if (sex == 0)
				{
					System.out.println("带一把小花伞");
				}
				else
				{
					System.out.println("带一把大黑伞");
				}

		
		}
	}
}
*/



/*
下雨 女 “带一把小花伞”
下雨 男 “带一把大黑伞”
晴天 温度高于30摄氏度 女 “擦防晒霜”
晴天 温度高于30摄氏度 男 “戴墨镜”
晴天 温度低于30摄氏度 女 “什么也不带”
晴天 温度低于30摄氏度 男 “什么也不带”
*/
public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("您好，欢迎您使用此系统");
		System.out.println("请您输入一些信息，不要不识抬举");
		System.out.println("0表示晴天，1表示下雨");
		int weather = s.nextInt();
		System.out.println("请您输入一些信息，不要不识抬举");
		System.out.println("0表示女，1表示男");
		int sex = s.nextInt();
		if (weather == 0){//晴天
			System.out.println("请您输入当前温度，不要不识抬举");
			//接受气温
			int Temperture = s.nextInt();
			if (Temperture > 30){//热天
				if (sex == 0){//女性晴天热天带什么
					System.out.println("擦防晒霜");
				}else{//男性晴天热天带什么
					System.out.println("戴眼镜");
					}
			}else{//晴天凉天带什么
				System.out.println("什么也不带");
				}
		}else{//雨天
			if (sex == 0){
				System.out.println("带一把小花伞");
				}
			else{
				System.out.println("带一把大黑伞");
				}
			}
	}
}