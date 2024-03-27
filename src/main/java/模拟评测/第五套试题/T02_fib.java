package 模拟评测.第五套试题;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-03-23 09:35
 */
public class T02_fib {

	public static void main(String[] args) {
		int f1 = 1, f2 = 1;
		int sum = 0;

		System.out.println(f1);
		System.out.println(f2);
		int index = 2;
		do {

			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			index++;
			System.out.println(index + "\t" + sum);
		} while (f2 < 20211001);

	}
}
