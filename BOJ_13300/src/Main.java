import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 총 학생 수
		int K = Integer.parseInt(st.nextToken()); // 배정 최대 인원
		int[] girl = new int[6]; // 학년별 여학생 수
		int[] boy = new int[6]; // 학년별 남학생 수
		
		for(int i = 0; i<N; i++) {
			StringTokenizer ss = new StringTokenizer(br.readLine());
			int sCheck = Integer.parseInt(ss.nextToken()); // 첫번째 수
			int gradeChk = Integer.parseInt(ss.nextToken()); // 두번째 수
			
			if(sCheck == 1) { // 남자라면,
				boy[gradeChk - 1] ++;
			}else { // 여자라면,
				girl[gradeChk-1] ++;
			}
		}
		
		int room = 0; // 방 개수
		
		for(int i = 0; i<6; i++) {
			room += (girl[i]/K);
			room += (boy[i]/K);
			if(girl[i]%K!=0) room +=1;
			if(boy[i]%K!=0) room +=1;
			
		}
		
		System.out.println(room);

	}

}
