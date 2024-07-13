import java.util.Arrays;
import java.util.Scanner;

public class Main {

		// 일곱 난쟁이
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[9];
			int sum = 0;
			int result = 0;
			
			for(int i = 0; i<9; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			result = sum - 100;
			
			cute : for(int i = 0; i<8; i++) {
				for(int j = 1; j<9; j++) {
					if(arr[i]+arr[j] == result) {
						arr[i] = -1;
						arr[j] = -1;
						break cute;
					}
				}
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i<9; i++) {
				if(arr[i] != -1) {
					System.out.println(arr[i]);
				}
			}
			
			
			sc.close();
		}
}