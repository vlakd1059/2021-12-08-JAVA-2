import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		// num�� ����� ���� �հ�
		int result = getSumOfDivisors(num);
		System.out.println(num + "�� ����� ��: " + result);
		// num�� ������� ���.
		getDivisors(num);

	}

	public static void getDivisors(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}

		}
		return sum;
	}
}
