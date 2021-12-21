public class OOTest02{

	public static void main(String[] args){

		//创建一个丈夫类，并命名丈夫的名字为黄晓明
		Husband huangXiaoMing = new Husband();
		huangXiaoMing.name = "黄晓明";

		//创建一个妻子类，并命名妻子的名字为杨颖
		Wife baby = new Wife();
		baby.name = "杨颖";

		//结婚【可以通过黄晓明找到baby，通过baby找到黄晓明】
		huangXiaoMing.w = baby;
		baby.h = huangXiaoMing;

		//得到黄晓明妻子的名字
		//通过妻子访问
		System.out.println( "黄晓明妻子的名字是：" + baby.name);
		//通过黄晓明访问
		System.out.println( "黄晓明妻子的名字是：" + huangXiaoMing.w.name);

		//得到baby丈夫的名字
		//通过丈夫访问
		System.out.println( "baby丈夫的名字是：" + huangXiaoMing.name);
		//通过杨颖访问
		System.out.println( "baby丈夫的名字是：" + baby.h.name);
	}
}