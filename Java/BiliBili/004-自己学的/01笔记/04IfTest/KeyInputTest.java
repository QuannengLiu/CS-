/*
//�Լ�д��
public class KeyInputTest{

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������������䣺");
		int userInputContent = s.nextInt();
		String ageStage =  "�Բ������������ֵ���Ϸ�";
		if (userInputContent < 0 || userInputContent > 150)
		{
		}else if(userInputContent >= 56){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(userInputContent >= 36){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(userInputContent >= 19){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(userInputContent >= 11){
			ageStage =  "�����ڴ��������е�������ʱ��";
		}else if(userInputContent >= 6){
			ageStage =  "�����ڴ��������е��ٶ�ʱ��";
		}else{
			ageStage =  "�����ڴ��������е��׶�ʱ��";
		}
		System.out.println(ageStage);
	}
}
*/


//�����޸ĺ��
public class KeyInputTest{

	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������������䣺");
		int age = s.nextInt();
		String ageStage =  "�Բ������������ֵ���Ϸ�";
		if (age < 0 || age > 150)
		{
		}else if(age >= 56){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(age >= 36){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(age >= 19){
			ageStage =  "�����ڴ��������е�����ʱ��";
		}else if(age >= 11){
			ageStage =  "�����ڴ��������е�������ʱ��";
		}else if(age >= 6){
			ageStage =  "�����ڴ��������е��ٶ�ʱ��";
		}else{
			ageStage =  "�����ڴ��������е��׶�ʱ��";
		}
		System.out.println(ageStage);
	}
}