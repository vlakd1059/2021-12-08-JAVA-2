import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = gerAbsoluteValue(num1, num2);
		System.out.println("��� Ȯ�� >> " + result);

	}

	public static int gerAbsoluteValue(int num1, int num2) {
		// int result = num1 - num2;
		// return result > 0 ? result: Math.abs(result);
		int a = Math.abs(num1 - num2);
		return a;
	}

}
