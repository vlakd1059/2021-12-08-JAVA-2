import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 8, 7, 9, 10 };
		arryToString(arr);
	}

	public static void arryToString(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		//Arrays Ŭ������ toString() �Լ� ����ϱ�.
		System.out.println(Arrays.toString(arr));
		
	}
}
