import java.util.*;

public class Main {
    static int[][] map;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        map = new int[5][5]; // ������
        
        for (int i = 0; i < 5; i++) { // ������ ä���
            for (int j = 0; j < 5; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        int K = 0;
        for (int k = 0; k < 25; k++) { // �θ� ���ڿ� ���� ���ڴ� -1�� �ٲ�
            int checkNum = sc.nextInt();
            K++;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == checkNum) {
                        map[i][j] = -1;
                    }
                }
            }
            
            if (checkBingo() >= 3) { // ���� üũ �Լ� ȣ�� 
                System.out.println(K);
                return;
            }
        }
        
        sc.close();
    }
    
    public static int checkBingo() {
        int count = 0; // ���� �� üũ 
        
        // ���� üũ
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
        
        // ���� üũ
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
        
        // �밢�� üũ (���� ������ ������ �Ʒ�)
        int num = 0;
        for (int i = 0; i < 5; i++) {
            if (map[i][i] == -1) {
                num++;
            }
        }
        if (num == 5) {
            count++;
        }
        
        // �밢�� üũ (������ ������ ���� �Ʒ�)
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
