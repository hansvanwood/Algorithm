package 日常刷题;

import java.io.IOException;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-03-12 11:27
 */
public class 整数变换 {
	public static void main(String[] args) throws IOException {
		Solution s = new Solution();
		s.test();
	}
}
class Solution {
	long calculateDigitSum(long num) {
		long digitSum = 0; //最终的结果：num的数位和
		long remainder = 0;//每次从num中取出来的一位数

		// 计算数位和
		while (num != 0) {
			remainder = num % 10;
			digitSum += remainder;
			num /= 10;
		}
		return digitSum;
	}

	void test() throws IOException {
		long n = 1078979432; //小蓝给的整数n
		long countMinute = 0; //计数器，计算过去了多少分钟

		do {
			n = n - calculateDigitSum(n);
			System.out.println("n="+ n);
			countMinute++;
		} while (n > 0);

		System.out.println("countMinute="+ countMinute);

	}
}