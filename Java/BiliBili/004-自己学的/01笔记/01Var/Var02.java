/*
public class Var02{


	public static void main(String[] args){
		int a = 4;
		System.out.println(a);




	}

	public static void m(String[] args){
	int a = 5;
	System.out.println(a);
	
	}//m不是主方法，不是程序的入口，若主方法中没有调用这个函数，则不会被执行
}//4
*/

/*
public class Var02{


	public static void main(String[] args){
		int a = 4;
		if(a>3){
			int i=10;

		}
		System.out.println(i);



	}
	
}//错误原因：在编译过程中仅编译而不运行，故编译时不会判断出来a>3为真，进而i不会被定义并赋值，进而出错
*/

public class Var02{


	public static void main(String[] args){
		int a = 4;
		int i = 3;
		if(a>3){
			i=10;

		}
		System.out.println(i);



	}
	
}