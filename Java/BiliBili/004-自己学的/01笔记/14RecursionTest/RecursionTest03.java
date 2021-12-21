public class RecursionTest03{

	public static void main(String[] args){

		int N = 8;
		System.out.println(sumInt(N));
	
	}

	public static int sumInt(int N){

		
		if (N == 0){
			return 0;
		}

		return N + sumInt(N-1);
	}
}