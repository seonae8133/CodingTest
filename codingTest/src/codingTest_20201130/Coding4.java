package codingTest_20201130;

import java.util.Scanner;

public class Coding4 {
	public static void main(String[] args) {
		/*https://www.acmicpc.net/problem/10869
		 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		입력
		두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
		
		출력
		첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		
		예제 입력 1 
		7 3
		예제 출력 1 
		10
		4
		21
		2
		1
		 * 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		int A,B;
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
}