public class RecursionTest02{
	//����1~N1�ĺ�
	public static void main(String[] args){
		
		int N = 8;
		System.out.println("����1~" + N + "�ĺ�" + "=" + sumInt(N));

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