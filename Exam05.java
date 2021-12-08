import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = gerAbsoluteValue(num1, num2);
		System.out.println("결과 확인 >> " + result);

	}

	public static int gerAbsoluteValue(int num1, int num2) {
		// int result = num1 - num2;
		// return result > 0 ? result: Math.abs(result);
		int a = Math.abs(num1 - num2);
		return a;
	}

}
