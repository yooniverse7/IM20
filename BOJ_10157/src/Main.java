import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.*;
// 자리배정 
public class Main {
	
	static int[] dx = {0, 1, 0, -1}; // 오, 아래, 왼, 위
	static int[] dy = {1, 0, -1, 0}; // 오, 아래, 왼, 위

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int[][] arr = new int[C][R];
		
		int count = 1;
		int x = 0;
		int y = 0;
		int k = 0;
		while (count <= C*R) {
			arr[x][y] = count;
			count++;
			int nextX = x+dx[k];
			int nextY = y+dy[k];
			
			// 범위를 벗어나거나 칸에 값이 있으면 방향바꾸기
			if(nextX >= C || nextX < 0 || nextY >= R || nextY<0 || arr[nextX][nextY] != 0) {
				k = (k+1)%4;
				nextX = x + dx[k];
				nextY = y + dy[k];
			}
			
			x = nextX;
			y = nextY;
		}
		boolean find = false;
		int num = Integer.parseInt(br.readLine());
		cute : for(int i = 0; i<C; i++) {
			for(int j = 0; j<R; j++) {
				if(arr[i][j] == num) {
					System.out.println((i+1) + " " + (j+1));
					find = true;
					break cute;
				}
			}
		}

		if(!find) { // 해당 숫자가 없으면 0출력
			System.out.println(0);
		}
		
	}

}
