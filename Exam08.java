
public class Exam08 {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� :�޼ҵ��� �̸��� �ϳ��� �ְ� �Ű������� �ٸ��� �����ν� �޼ҵ带 ������ ����� ���
		// -> �ߺ� ����   ���� �Լ��̸��� �ٸ� �ڷ����� �־ ������ Ư¡
		
//		int a=10;
//		int b=2;
		// �ΰ� ���� ������ �� �ִ� add() �����
		add(10,2);
		add(10,2.4);
		
		
	}
	// ������ add �Լ�
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// �������� add �޼ҵ带 �ߺ����� �Ͽ� ������ �޼ҵ�
	public static void add(int a, double b) {
		System.out.println(a+b);
	}
}
