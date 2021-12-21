public class ForTest06{
	//for循环嵌套
	//注意内外层定义的变量不要重复

	public static void main(String[] args){
		for (int i = 0; i < 10; i++){

			for(int j = 0; j < 3; j++){

			System.out.println("j---------->" + j);

			}
			System.out.println("------------------------------------------------");

		}

	}
}