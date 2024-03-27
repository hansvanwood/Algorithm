package 模拟评测.第五套试题;

import java.util.Scanner;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-03-23 11:02
 */
public class T11_count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalNum = scanner.nextInt();
		if (totalNum < 2 || totalNum > 100000000) {
			throw new IndexOutOfBoundsException("数的范围不能小于2或大于100000000");
		}
		String[] array = String.valueOf(totalNum).split("");
		System.out.println(array.length);
	}
}
