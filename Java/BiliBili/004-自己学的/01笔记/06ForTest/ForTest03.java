public class ForTest03
{


	public static void main(String[] args){
		//累加1~100所有的奇数
		int sum = 0;
		for (int i = 1;i < 101; i += 2)
		{
			sum += i;
			System.out.println(i);

		}
	
	System.out.println("---------------------------------------------------------");
	System.out.println(sum);
		
	}
}