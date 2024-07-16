import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.*;
// �ڸ����� 
public class Main {
	
	static int[] dx = {0, 1, 0, -1}; // ��, �Ʒ�, ��, ��
	static int[] dy = {1, 0, -1, 0}; // ��, �Ʒ�, ��, ��

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
			
			// ������ ����ų� ĭ�� ���� ������ ����ٲٱ�
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

		if(!find) { // �ش� ���ڰ� ������ 0���
			System.out.println(0);
		}
		
	}

}
