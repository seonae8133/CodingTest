package codingTest_20210130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*for문 - N 찍기
	 * 문제
	자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
	
	출력
	첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
	
	예제 입력 1 
	5
	예제 출력 1 
	1
	2
	3
	4
	5
 * */
public class Coding2 {
	public static void main (String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//입력스트림생성
		
		int Num;
		int i;
		try {
			System.out.println("자연수N을 입력하세요");
			Num = Integer.parseInt(bf.readLine());
			for(i =1; i<=Num; i++) {
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//출력 스트림 생성
				bw.write(i+"\n");   //버퍼에 있는 값 전부 출력
				if(i==Num) {
					bw.close(); 
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
