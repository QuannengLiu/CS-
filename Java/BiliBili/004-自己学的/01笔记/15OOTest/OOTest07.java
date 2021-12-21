public class OOTest07{

	public static void main(String[] args){

		//创建笔记本电脑属性并赋值
		Laptop laptop = new Laptop();	
		laptop.brand = "lenovo";
		laptop.model = "superModel";
		laptop.color = "yellow";

		//创建学生属性并赋值		
		Student02 xiaoMing = new Student02();
		xiaoMing.id = 2021;
		xiaoMing.name = "xiaoMing";

		//创建笔记本电脑类与学生类之间的关系
		xiaoMing.l = laptop;
		
		//通过学生找到笔记本电脑的属性
		System.out.println("小明的笔记本电脑品牌是：" + xiaoMing.l.brand);
		System.out.println("小明的笔记本电脑型号是：" + xiaoMing.l.model);
		System.out.println("小明的笔记本电脑颜色是：" + xiaoMing.l.color);

	}
}