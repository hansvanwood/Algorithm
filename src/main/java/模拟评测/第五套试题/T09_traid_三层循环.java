package 模拟评测.第五套试题;

import java.util.Scanner;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-03-27 18:00
 */
public class T09_traid_三层循环 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 数列的长度
		int[] a = new int[n]; // 存储数列的数组
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println(countUnequalTriplets(a));
	}

	private static int countUnequalTriplets(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					// 检查 a[i], a[j], a[k] 是否互不相同
					if (a[i] != a[j] && a[j] != a[k] && a[i] != a[k]) {
						count++;
					}
				}
			}
		}
		return count;
	}
}

