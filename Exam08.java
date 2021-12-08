
public class Exam08 {

	public static void main(String[] args) {
		//메소드 오버로딩 :메소드의 이름은 하나만 주고 매개변수를 다르게 함으로써 메소드를 여러개 만드는 기법
		// -> 중복 정의   같은 함수이름의 다른 자료형을 넣어도 가능한 특징
		
//		int a=10;
//		int b=2;
		// 두개 수를 더해줄 수 있는 add() 만들기
		add(10,2);
		add(10,2.4);
		
		
	}
	// 기존의 add 함수
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// 정수형의 add 메소드를 중복정의 하여 생성된 메소드
	public static void add(int a, double b) {
		System.out.println(a+b);
	}
}
