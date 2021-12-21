public class ForTest09{

	public static void main(String[] args){
		//输出1~100的所有质数
		int remainder = 2;

		for (int i = 1;  i < 101; i++)
		{
			int k = 0;

			for ( int j = 1; j < i; j++){
				
				remainder = i % j;

				if ( remainder == 0)
				{
					k++;
				}					
			}

			if (k == 1){
					System.out.print(i + " ");
					}

		}	
	
	}
}