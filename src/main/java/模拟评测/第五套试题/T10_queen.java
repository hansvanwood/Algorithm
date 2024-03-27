package 模拟评测.第五套试题;

import java.util.Scanner;

/**
 * 问题描述
 * 给定一个n*n的棋盘。现在要向棋盘中放入n个黑皇后和n个白皇后，使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或同一条对角线上。问总共有多少种放法？
 * 输入格式：输入的第一行包含一个整数n。
 * 输出格式：输出一行包含一个整数，表示答案。
 *
 * @author : bugu
 * @date : 2024-03-23 11:06
 */
public class T10_queen {
	static int n;
    static int[] blackQueens;
    static int[] whiteQueens;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        blackQueens = new int[n];
        whiteQueens = new int[n];

        placeQueens(0);

        System.out.println(count);
    }

    // 回溯放置皇后
    public static void placeQueens(int row) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidPosition(row, col)) {
                blackQueens[row] = col;
                placeQueens(row + 1);
                blackQueens[row] = 0;
            }
        }
    }

    // 检查当前位置是否可以放置皇后
    public static boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (blackQueens[i] == col || Math.abs(blackQueens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}