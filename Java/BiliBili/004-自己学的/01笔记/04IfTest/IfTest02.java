public class IfTest02{

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的年龄：");
		int age = s.nextInt();
		String ageStage =  "对不起，您输入的数值不合法";
		if (age < 0 || age > 150)
		{
		}else if(age >= 56){
			ageStage =  "您现在处于生命中的老年时期";
		}else if(age >= 36){
			ageStage =  "您现在处于生命中的中年时期";
		}else if(age >= 19){
			ageStage =  "您现在处于生命中的青年时期";
		}else if(age >= 11){
			ageStage =  "您现在处于生命中的青少年时期";
		}else if(age >= 6){
			ageStage =  "您现在处于生命中的少儿时期";
		}else{
			ageStage =  "您现在处于生命中的幼儿时期";
		}
		System.out.println(ageStage);
	}
}