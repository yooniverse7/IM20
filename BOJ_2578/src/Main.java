import java.util.*;

public class Main {
    static int[][] map;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        map = new int[5][5]; // 빙고판
        
        for (int i = 0; i < 5; i++) { // 빙고판 채우기
            for (int j = 0; j < 5; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        int K = 0;
        for (int k = 0; k < 25; k++) { // 부른 숫자와 같은 숫자는 -1로 바꿈
            int checkNum = sc.nextInt();
            K++;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == checkNum) {
                        map[i][j] = -1;
                    }
                }
            }
            
            if (checkBingo() >= 3) { // 빙고 체크 함수 호출 
                System.out.println(K);
                return;
            }
        }
        
        sc.close();
    }
    
    public static int checkBingo() {
        int count = 0; // 라인 수 체크 
        
        // 가로 체크
        for (int i = 0; i < 5; i++) {
            int num = 0;
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == -1) {
                    num++;
                }
            }
            if (num == 5) {
                count++;
            }
        }
        
        // 세로 체크
        for (int i = 0; i < 5; i++) {
            int num = 0;
            for (int j = 0; j < 5; j++) {
                if (map[j][i] == -1) {
                    num++;
                }
            }
            if (num == 5) {
                count++;
            }
        }
        
        // 대각선 체크 (왼쪽 위에서 오른쪽 아래)
        int num = 0;
        for (int i = 0; i < 5; i++) {
            if (map[i][i] == -1) {
                num++;
            }
        }
        if (num == 5) {
            count++;
        }
        
        // 대각선 체크 (오른쪽 위에서 왼쪽 아래)
        num = 0;
        for (int i = 0; i < 5; i++) {
            if (map[i][4 - i] == -1) {
                num++;
            }
        }
        if (num == 5) {
            count++;
        }
        
        return count;
    }
}
