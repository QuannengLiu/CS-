public class RecursionTest02{
	//计算1~N1的和
	public static void main(String[] args){
		
		int N = 8;
		System.out.println("整数1~" + N + "的和" + "=" + sumInt(N));

	}

	public static int sumInt(int N){
		
		int result = 0;
		for (int j = 0; j < N; ){

			j++;
			result += j;
			System.out.println(result);


		}
		return result;

	}
}