public class BreakTest01{


	public static void main(String[] args){
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 3; j++)
			{

				if (i == 5)
				{
					break;
				}
				System.out.println("j------>" + j);
			}
			
		}
	
	
	
	}
}