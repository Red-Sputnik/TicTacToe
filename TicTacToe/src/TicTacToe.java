import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private final char X = 'X';
    private final char O = 'O';
    private final char EMPTY = '□';
    private final char[][] board = new char[3][3];
    private char currentPlayer;

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }

    public TicTacToe() {
        initBoard();
        currentPlayer = X;
    }

    public void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        while (true) {
            System.out.println("Игрок, введите свой ход: ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == EMPTY) {
                board[x][y] = currentPlayer;
                break;
            } else {
                System.out.println("Неверный ход! Попробуйте еще раз.");
            }
        }
    }

    public void aiMove() {
        Random random = new Random();
        int x, y;
        while (true) {
            System.out.println("ИИ делает свой ход...");
            x = random.nextInt(3);
            y = random.nextInt(3);

            if (board[x][y] == EMPTY) {
                board[x][y] = O;
                break;
            }
        }
        System.out.println("ИИ выбрал ход: " + x + " " + y);
    }

    public void play() {
        while (true) {
            printBoard();
            playerMove();
            aiMove();

            if(checkWin(X)) {
                printBoard();
                System.out.println("Игрок выиграл!");
                break;
            }

            if(checkWin(O)) {
                printBoard();
                System.out.println("ИИ выиграл!");
            }

            if(isBoardFull()) {
                printBoard();
                System.out.println("Ничья!");
                break;
            }
        }
    }
}
