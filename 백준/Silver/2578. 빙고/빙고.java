import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] bingoBoard = new int[5][5];  
        int[][] cellOrder = new int[5][5];   

        fillBoard(bingoBoard, cellOrder, br);
        gameStart(bingoBoard, cellOrder);
    }

    private static void fillBoard(int[][] bingoBoard, int[][] cellOrder, BufferedReader br) throws IOException {
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cellOrder[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void gameStart(int[][] bingoBoard, int[][] cellOrder) {
        int count = 0; 

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int calledNumber = cellOrder[i][j];
                count++;

                markBingo(bingoBoard, calledNumber);

                if (isBingo(bingoBoard)) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }

    // 빙고판에서 불린 숫자를 0으로 바꿈
    private static void markBingo(int[][] bingoBoard, int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingoBoard[i][j] == number) {
                    bingoBoard[i][j] = 0;
                    return;
                }
            }
        }
    }

    // 빙고가 성립했는지 확인
    private static boolean isBingo(int[][] bingoBoard) {
        int bingoCount = 0;

        // 가로 빙고 확인
        for (int i = 0; i < 5; i++) {
            int rowCount = 0;
            for (int j = 0; j < 5; j++) {
                if (bingoBoard[i][j] == 0) rowCount++;
            }
            if (rowCount == 5) bingoCount++;
        }

        // 세로 빙고 확인
        for (int j = 0; j < 5; j++) {
            int colCount = 0;
            for (int i = 0; i < 5; i++) {
                if (bingoBoard[i][j] == 0){
                    colCount++;
                }
            }
            if (colCount == 5){
                bingoCount++;
            }
        }

        // 왼쪽 대각선 빙고 확인
        int leftDiagCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingoBoard[i][i] == 0){
                leftDiagCount++;
            }
        }
        if (leftDiagCount == 5){
            bingoCount++;
        }

        // 오른쪽 대각선 빙고 확인
        int rightDiagCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingoBoard[i][4 - i] == 0){
                rightDiagCount++;
            }
        }
        if (rightDiagCount == 5){
            bingoCount++;
        }

        
        if(bingoCount >= 3){
            return true;
        }else{
            return false;
        }
    }
}
