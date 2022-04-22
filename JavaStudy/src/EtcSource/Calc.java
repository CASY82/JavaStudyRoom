package EtcSource;

import java.util.Scanner;

// 일부러 예외는 잡지 않는다. 그것이 퀴즈니까~
public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a와 b, 두 수를 입력하시오.");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println("다음 행할 연산을 선택하시오.(a가 앞에 b가 뒷 수입니다.)\n");
		System.out.println("1. 덧셈\n");
		System.out.println("2. 뺄셈\n");
		System.out.println("3. 곱셈\n");
		System.out.println("4. 나눗셈\n");
		
		int calc = sc.nextInt();
		
		int result = 0;
		boolean check = true;
		
		switch (calc) {
		case 1:
			result = first + second;
			break;
		case 2:
			result = first - second;
			break;
		case 3:
			result = first * second;
			break;
		case 4:
			result = first / second;
			break;
		default:
			System.out.println("그런 연산은 없다.");
			check = false;
			break;
		}
		
		if(check) {
			System.out.println("결과는 " + result + "입니다.");
		}
	}

}
