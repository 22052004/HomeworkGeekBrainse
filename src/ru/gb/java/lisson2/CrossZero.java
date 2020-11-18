package ru.gb.java.lisson2;
import java.util.Random;
import java.util.Scanner;
public class CrossZero {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WINE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initTable();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWine(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничия");
                break;
            }
            aiTurn();
            printMap();
            if (checkWine(DOT_O)) {
                System.out.println("Победил искуственный интилект");
                break;
            }
        }
        System.out.println("Игра закончина");
    }
    public static void initTable() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    private static boolean checkWine(char symb) {
        int endOfOffset = map.length - DOTS_TO_WINE;
        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++) {
            if (isDiagonalsFilledWith(symb, rowOffset)) {
                return true;
            }
            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++) {
                boolean hasWin =
                        isLinesFilledWith(symb, rowOffset, columnOffset);
                if (hasWin) {
                return true;
                }
            }
        }
        return false;
    }
    private static boolean isLinesFilledWith(char symb,int rowOffset, int columnOffset) {
        for (int row = rowOffset; row < (DOTS_TO_WINE + rowOffset);row++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;
            for (int column = columnOffset; column < (DOTS_TO_WINE + columnOffset); column++) {
                if (map[row][column] == symb) {
                  horizontalWinCounter++;
                }
                else {
                    horizontalWinCounter = 0;
                }
                if (map [column][row] == symb) {
                    verticalWinCounter++;
                }
                else {
                    verticalWinCounter = 0;
                }
            }
            if ((horizontalWinCounter == DOTS_TO_WINE) || (verticalWinCounter == DOTS_TO_WINE)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isDiagonalsFilledWith(char symb, int rowOffset) {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;
        final int subSquareLength = (DOTS_TO_WINE + rowOffset);
        for (int row = rowOffset; row < subSquareLength; row++) {
            if (map[row][row] == symb) {
                mainDiagonalCounter++;
            }
            else {
                mainDiagonalCounter = 0;
            }
            if (map[row][map.length - 1 - row] == symb) {
                sideDiagonalCounter++;
            }
            else {
                sideDiagonalCounter = 0;
            }
        }
        return (mainDiagonalCounter == DOTS_TO_WINE) || (sideDiagonalCounter == DOTS_TO_WINE);
    }
}