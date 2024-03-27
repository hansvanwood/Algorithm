package 模拟评测.第五套试题;

import java.util.*;

/**
 * 问题描述
 * 小蓝最近在研究单词，他发现有些单词（或者字母组合）是“辅元辅元辅”形式的，即总共包含 5 个字母，第 1, 3, 5 个字母是辅音字母，第 2, 4 个字母是元音字母。
 * 其中元音字母包括 a, e, i, o, u 共 5 个，辅音字母包括其它 21 个。
 * <p>
 * 如果一个单词是“辅元辅元辅”形式且同一个字母最多出现一次，小蓝认为这种单词很美丽，称为 “美丽单词”。
 * 例如：xilan 就是一个美丽单词。
 * 请问，一共有多少个美丽单词。
 *
 * @author : bugu
 * @date : 2024-03-23 09:42
 */
public class T03_word_bak {
	public static Queue<Character> vowels = new ArrayDeque<>();//元音5个
	public static Queue<Character> consonants = new ArrayDeque<Character>();//辅音21个
		static {
		for (char c : "aeiou".toCharArray()) {
			vowels.add(c);

		}
		for (char c : "qwrtypsdfghjklzxcvbnm".toCharArray()) {
			consonants.add(c);
		}
	}

	public static int totalLength = 5;//5位数的单词
	static int currentIndex = 0;
	static int result = 1;

	public static int calculate(int m, int n) {
		if (currentIndex == totalLength) {
			return result;
		}
		currentIndex++;
		if (currentIndex == 2 || currentIndex == 4) {
			result *= n;
			return calculate(m, n - 1);
		} else {
			result *= m;
			return calculate(m - 1, n);
		}

	}

	public static void main(String[] args) {
		int result = calculate(21, 5);
		System.out.println(result);

	}


}
