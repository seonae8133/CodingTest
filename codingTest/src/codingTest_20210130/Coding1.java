package codingTest_20210130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*for문 - 빠른 A+B 
	https://www.acmicpc.net/problem/15552
	본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
	입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
	Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
	BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
	또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
	테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

	[입력]
	첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. 
	A와 B는 1 이상, 1,000 이하이다.
	
	[출력]
	각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
	
	[예제 입력 1] 
	5
	1 1
	12 34
	5 500
	40 60
	1000 1000
	[예제 출력 1] 
	2
	46
	505
	100
	2000
*/

public class Coding1 {
	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer선언
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {// 예외처리를 꼭 해주어야한다.(보편적으로 throws IOException을 통하여 예외처리)(try & catch를 활용하여 예외처리 또한
				// 가능)
				// String sNum = bf.readLine();//readLine()의 리턴값은 String 으로 고정임.
			System.out.println("입력할 테스트 케이스 수를 입력하세요");
			int Num = Integer.parseInt(bf.readLine());// 다른타입으로 입력을 받을려면 형변환 필요
			System.out.println("입력받은 값 : " + Num);
			for (int i = 0; i < Num; i++) {
				st = new StringTokenizer(bf.readLine());
				
				//nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다. 
				bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");//버퍼에 있는 값 전부 출력
				bw.close(); //스트림을 닫음
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //

	}
}
