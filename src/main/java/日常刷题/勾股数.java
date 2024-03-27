package 日常刷题;

/**
 * 勾股数是很有趣的数学概念。如果三个正整数a、b、c，满足a^2 + b^2 = c^2，而且1 ≤ a ≤ b ≤ c，
 * 我们就将a、b、c组成的三元组(a, b, c)称为勾股数。
 * 你能通过编程，数数有多少组勾股数，能够满足c ≤ n吗？
 * <p>
 * 输入格式
 * 输入一行，包含一个正整数n。约定 1 ≤ n ≤ 1000。
 * <p>
 * 输出格式
 * 输出一行，包含一个整数c，表示有c组满足条件的勾股数。
 *
 * @author : bugu
 * @date : 2024-03-24 09:49
 */
public class 勾股数 {

	public static void main(String[] args) {

	}

	private static int howManyGroup(int n) {
		int a, b, c = 0;
		for (int i = 0; i <= n; i++) {
			a = i;

			//求a的质因数，得到b、c
			getPrimeFactors(a);
			//求解二元一次方程
			//a^2= (c-b)(c+b)
		}

		return 0;
	}

	private static void getPrimeFactors(int a) {

	}

	private boolean isValid(int a, int b, int c, int n) {
		if (1 <= a && a <= b && b <= c && c <= n) {
			if ((a * a + b * b) == (c * c)) {
				return true;
			}
		}
		return false;
	}
}
