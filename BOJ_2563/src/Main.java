import java.io.*;
import java.util.StringTokenizer;
//������
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ������ ��
		int[] count = new int[101]; // �ִ� ������ �� �迭
		int[][] arr = new int[100][100]; //��� ��ȭ��
		int result = N * 100; // ����
		
		for(int i =0; i<100; i++) { // ��ȭ���� �� 0���� ä��
			for(int j = 0; j<100; j++) {
				arr[i][j] = 0;
			}
		}
		
		for(int i = 0; i<=100; i++) { // ������ �� �迭�� 0���� ä��
			count[i] = 0;
		}
		
		for(int i = 0; i<N; i++) { // �����̰� �ٴ� ������ 1�� ������
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // ���� ��
			int y = Integer.parseInt(st.nextToken()); // ���� ��
			
			for(int j = x; j<x+10; j++) {
				for(int z = y; z<y+10; z++) {
					arr[j][z] +=1;
				}
			}
		}
		
		for(int i = 0; i<100; i++) { // �ߺ��� �κ� üũ���ֱ� 
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
