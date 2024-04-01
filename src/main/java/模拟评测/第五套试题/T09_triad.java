package 模拟评测.第五套试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 在数列a[1],a[2],...,a[n]中，如果对于下标i,j,k满足0<i<j<k<n+1且a[i],a[j],a[k]三个数互不相同，
 * 则称a[i],a[j],a[k]为一组不等三元组。给定一个数列，请问序列中有多少个不等三元组？
 * 输入格式
 * 输入的第一行包含一个整数n。第二行包含n个整数a[1],a[2],...,a[n]，相邻的整数间用空格分隔，表示给定的数列。
 * 输出格式
 * 输出一行包含一个整数，表示答案。
 *
 * @author : bugu
 * @date : 2024-03-23 10:58
 */
public class T09_triad {
	// 声明一个静态数组a来存储元素
	static int[] a = new int[100005];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 创建Scanner对象来读取输入
		// 读取总元素数量N
		int N = scanner.nextInt();

		// 题目要求：数组下标是从1开始的，所以代码中的0位不使用。
		// 从索引1开始读取元素到数组a
		for (int i = 1; i <= N; i++) {
			a[i] = scanner.nextInt(); // 读取每个元素
		}
		Arrays.sort(a, 1, N + 1); // 对数组a的1到N索引范围内的元素进行排序

		int low = 1; // 设置初始的低索引为1
		long answer = 0; // 用于存储最终结果的变量，初始化为0

		// 循环处理每个元素直到数组结束
		while (true) {
			int high = low; // 设置高索引与低索引相同
			// 如果下一个元素与当前low指向的元素相同，则high索引向后移
			while (high + 1 <= N && a[high + 1] == a[low])
				high++;
			// 根据当前元素的位置更新答案
			answer += (long) (high - low + 1) * (low - 1) * (N - high);
			low = high + 1; // 将低索引移动到下一个不同的元素位置
			if (low > N) break; // 如果低索引超出数组范围，则结束循环
		}

		System.out.println(answer); // 输出最终结果
	}
}
