public class RecursionTest04{

	public static void main(String[] args){

		int N = 5;
		System.out.println(factorial(N));
	
	}

	public static int factorial(int N){
		
		if (N == 1){
			return 1;
		}
		return N*factorial(N-1);

	}
}