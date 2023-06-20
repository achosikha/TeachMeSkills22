package HomeWork;

public class Chessboard {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    chessboard[row][col] = "W";
                } else {
                    chessboard[row][col] = "B";
                }
            }
        }

        // Выводим шахматную доску
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(chessboard[row][col] + " ");
            }
            System.out.println();
        }
    }
}