public class MethodTest08{
	//����ֵ��Ϊ��ʱ��

	public static void main(String[] args){

		//�Է���ֵ�����¸�ֵ���ӡ
		/*int numDivide = numInt(18, 2);
		System.out.println("answer is ---------->" + numDivide);
		*/

		//ֱ�Ӵ�ӡ������ֵ
		System.out.println("answer is ---------->" + numInt(18, 2));
	
	}

	public static int numInt(int dividend, int divisor){

		//������¸�ֵ���ٷ���
		/*
		int numDivide = dividend / divisor;
		return numDivide;
		*/

		//ֱ�ӷ��ؽ��
		return dividend / divisor;
	
	}

}