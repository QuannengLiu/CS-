public class P225{

	public static void main(String[] args){

		init();

	}
/*
	public static String name(String name){

		if (name == "admin")
		{
			return "恭喜您！登陆成功！";
		}
		else{

			return "对不起登陆失败！";

		}
	
	}

	public static String password(String password){

		if (password == "123")
		{
			return "恭喜您！登陆成功！";
		}
		else{

			return "对不起登陆失败！";
		}
	
	}
*/
	public static void init(){

		System.out.println("欢迎来到初始化登录页面，请依次输入用户名和密码。");
		System.out.print("请输入您的用户名：");
		java.util.Scanner s=new java.util.Scanner(System.in);
		String nameTest = s.next();

		java.util.Scanner j=new java.util.Scanner(System.in);
		System.out.print("请输入您的密码：");
		int passwordTest = j.nextInt();

		/*检测输对没有
		System.out.println(nameTest);
		System.out.println(passwordTest);
		*/


		//判断输对没有
		//一直出错原因，Java语句中判断两个字符串是否相等的方法有两种
		/*
		先来看一段示例代码：


		String a1 = "abc";
		String b1 = "abc";

		// 使用 == 判断相等时，指相同的内存地址，也就是同一个对象实例。
		System.out.println(a1 == b1); // true

		String a2 = new String("abc");
		String b2 = new String("abc");

		System.out.println(a2 == b2); // false 因为 a 和 b 指向不同对象。

		// equals 方法判断的相等在不同的对象中实现不同，意义也不同。
		System.out.println(a2.equals(b2)); // true

		*/


		if (nameTest.equals("admin") & passwordTest == 123){
			System.out.println("恭喜您，登陆成功！");
		}else{
			System.out.println("对不起，登陆失败！");
		}

/*
		if (nameTest.equals("admin")){
			System.out.println("恭喜您，登陆成功！");
		}else{
			System.out.println("对不起，登陆失败！");
		}

		if (passwordTest == 123){
			System.out.println("恭喜您，登陆成功！");
		}else{
			System.out.println("对不起，登陆失败！");
		}

*/
	}






}