/*
public class SwitchTest04{


	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("��ӭʹ�ü򵥼�����ϵͳ��");

		System.out.print("�������һ�����ݣ�");

		int firstData = s.nextInt();

		System.out.print("�������������");

		String operator = s.next();

		System.out.print("������ڶ������ݣ�");

		int secondData = s.nextInt();

		int calculationResults = 0;

		switch (operator)
		{
		
		case "+":
			calculationResults = firstData + secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "-":
			calculationResults = firstData - secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "*":
			calculationResults = firstData * secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "/":
			calculationResults = firstData / secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		case "%":
			calculationResults = firstData % secondData;
			System.out.print( firstData + operator + secondData + "=" + calculationResults );
			break;

		default :
			System.out.print("�Բ������������������");	
		
		}

	}
}
*/

/*
��������ʦд�ģ��м���ֵ��ѧϰ��
1������֪�⣺�硰��firstData����num1��;
2��ע�Ͷࣺ����������ɡ�1+1=2������Ϊ��������Ϊ��1+1=2����
3���Ű����룺�硱���ס��ļ��仰�������������ո�
*/

public class SwitchTest04{


	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼�����ϵͳ����ϵͳ��֧������֮��ļӼ��˳�ȡ�����㡣");

		System.out.print("�������һ�����ݣ�");
		int num1 = s.nextInt();

		System.out.print("�������������");
		String operator = s.next();

		System.out.print("������ڶ������ݣ�");
		int num2 = s.nextInt();

		int result = 0;
		switch (operator)
		{
		
		case "+":
			result = num1 + num2;
			System.out.print("������Ϊ��" + num1 + operator + num2 + "=" + result );
			break;

		case "-":
			result = num1 - num2;
			System.out.print( "������Ϊ��" + num1 + operator + num2 + "=" + result );
			break;

		case "*":
			result = num1 * num2;
			System.out.print( "������Ϊ��" + num1 + operator + num2 + "=" + result );
			break;

		case "/":
			result = num1 / num2;
			System.out.print( "������Ϊ��" + num1 + operator + num2 + "=" + result );
			break;

		case "%":
			result = num1 % num2;
			System.out.print( "������Ϊ��" + num1 + operator + num2 + "=" + result );
			break;

		default :
			System.out.print("�Բ������������������");			
		}

	}
}