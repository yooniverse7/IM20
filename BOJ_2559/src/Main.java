import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // ��ü ��¥ ��
		int K = Integer.parseInt(st.nextToken()); // �������� ��¥ ��
		int[] day = new int[N]; // ���� �µ� �迭
		StringTokenizer ss = new StringTokenizer(br.readLine());
		int Max = Integer.MIN_VALUE; // �ִ�
		
		for(int i = 0; i< N; i++) { // �迭 ä���
			day[i] = Integer.parseInt(ss.nextToken());
		}
		
		for(int i = 0; i<=N-K; i++) { // i�� N-K���� ����
			int sum = 0;
			for(int j = 0; j<K; j++) { // K���� ���� �����ϸ� �� ���
				sum +=day[i+j];
			}
			Max = Math.max(Max, sum); // �ִ� ���ϱ�
		}
		
		System.out.println(Max);
		
	}

}
