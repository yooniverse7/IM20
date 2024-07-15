import java.io.*;
import java.util.StringTokenizer;
//색종이
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 색종이 수
		int[] count = new int[101]; // 최대 색종이 수 배열
		int[][] arr = new int[100][100]; //흰색 도화지
		int result = N * 100; // 넓이
		
		for(int i =0; i<100; i++) { // 도화지를 다 0으로 채움
			for(int j = 0; j<100; j++) {
				arr[i][j] = 0;
			}
		}
		
		for(int i = 0; i<=100; i++) { // 색종이 수 배열을 0으로 채움
			count[i] = 0;
		}
		
		for(int i = 0; i<N; i++) { // 색종이가 붙는 영역에 1을 더해줌
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // 가로 값
			int y = Integer.parseInt(st.nextToken()); // 세로 값
			
			for(int j = x; j<x+10; j++) {
				for(int z = y; z<y+10; z++) {
					arr[j][z] +=1;
				}
			}
		}
		
		for(int i = 0; i<100; i++) { // 중복된 부분 체크해주기 
			for(int j = 0; j<100; j++) {
				count[arr[i][j]]++;
			}
		}
		
		for(int i = 1; i<=100; i++) {
			result -= count[i]*(i-1);
		}
		
		System.out.println(result);
	}

}
