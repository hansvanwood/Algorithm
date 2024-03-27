package 模拟评测.第五套试题;

import java.util.Scanner;

/**
 * 样例输入
 * 5
 * 1234 XiaoLan 2021 DaSai
 * 2345 LanQiao 123456 DaSai
 * 1234 XiaoLan 202110 XiaoNei
 * 7823 XiaoLan 98765 DaSai
 * 789123 XiaoLanQiao
 * 43091 XiaNei
 * XiaoLan
 *
 * @author : bugu
 * @date : 2024-03-27 10:20
 */
public class JavaScanner {

	public static void main(String[] args) {
		//编写代码，能正确接收样例输入
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			String next = scanner.next();
//			String next = scanner.nextLine();

			System.out.println(String.format("input:(%s)", next));
		}


	}
	/**
	 * next() 与 nextLine() 区别
	 * next():
	 * 1、一定要读取到有效字符后才可以结束输入。
	 * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
	 * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
	 * 4、next() 不能得到带有空格的字符串。
	 *
	 * nextLine()：
	 * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
	 * 2、可以获得空白。
	 * 如果要输入int或float类型的数据，在Scanner类中也有支持，但是在输入之前最好先使用hasNextXxx()方法进行验证，再使用nextXxx()来读取。
	 */
}
