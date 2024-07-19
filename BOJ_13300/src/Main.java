import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // �� �л� ��
		int K = Integer.parseInt(st.nextToken()); // ���� �ִ� �ο�
		int[] girl = new int[6]; // �г⺰ ���л� ��
		int[] boy = new int[6]; // �г⺰ ���л� ��
		
		for(int i = 0; i<N; i++) {
			StringTokenizer ss = new StringTokenizer(br.readLine());
			int sCheck = Integer.parseInt(ss.nextToken()); // ù��° ��
			int gradeChk = Integer.parseInt(ss.nextToken()); // �ι�° ��
			
			if(sCheck == 1) { // ���ڶ��,
				boy[gradeChk - 1] ++;
			}else { // ���ڶ��,
				girl[gradeChk-1] ++;
			}
		}
		
		int room = 0; // �� ����
		
		for(int i = 0; i<6; i++) {
			room += (girl[i]/K);
			room += (boy[i]/K);
			if(girl[i]%K!=0) room +=1;
			if(boy[i]%K!=0) room +=1;
			
		}
		
		System.out.println(room);

	}

}
