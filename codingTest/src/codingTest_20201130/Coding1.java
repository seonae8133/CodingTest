package codingTest_20201130;

import java.util.Scanner;

public class Coding1 {
	public static void main(String[] args) {
		/*A+B 다국어분류
		 * https://www.acmicpc.net/problem/1000
		문제
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

		출력
		첫째 줄에 A+B를 출력한다.

		예제 입력 1 
		1 2
		예제 출력 1 
		3
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0보다 큰 수를 입력하세요");
		int A = scan.nextInt();
		System.out.println("10보다 큰 수를 입력하세요");
		int B = scan.nextInt();
		
		System.out.println(A+B);
		
		
		
		
		
	}
}
