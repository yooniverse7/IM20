import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 전체 날짜 수
		int K = Integer.parseInt(st.nextToken()); // 연속적인 날짜 수
		int[] day = new int[N]; // 매일 온도 배열
		StringTokenizer ss = new StringTokenizer(br.readLine());
		int Max = Integer.MIN_VALUE; // 최댓값
		
		for(int i = 0; i< N; i++) { // 배열 채우기
			day[i] = Integer.parseInt(ss.nextToken());
		}
		
		for(int i = 0; i<=N-K; i++) { // i는 N-K까지 증가
			int sum = 0;
			for(int j = 0; j<K; j++) { // K까지 점점 증가하며 합 계산
				sum +=day[i+j];
			}
			Max = Math.max(Max, sum); // 최댓값 구하기
		}
		
		System.out.println(Max);
		
	}

}
