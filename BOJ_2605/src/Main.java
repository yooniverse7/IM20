import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;;;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 학생 수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 순서 문자열
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i<=N; i++) { // 해당 인덱스에 순서대로 넣기
			arr.add(Integer.parseInt(st.nextToken()), i);
		}
		
		for(int i = N-1; i>=0; i--) { // 뒤에서 부터 출력
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
