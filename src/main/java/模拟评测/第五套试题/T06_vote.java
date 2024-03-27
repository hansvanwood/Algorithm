package 模拟评测.第五套试题;

import java.util.Scanner;

/**
 * 问题描述
 * <p>
 * 内存限制：256.0MB
 * <p>
 * 同学们正在投票选班长，有 A 和 B 两位同学参选。
 * 有 n 张（奇数）有效选票，每张上有一个字母 A 或 B。被选得多的赢得选举。
 * 请问谁赢得了选举？
 * <p>
 * 输入格式
 * 输入的第一行包含一个整数 n。
 * 第二行包含一个长度为 n 字符串，表示每张选票。
 * <p>
 * 输出格式
 * 如果 A 赢得选举，输出 A，否则输出 B。
 *
 * @author : bugu
 * @date : 2024-03-23 10:09
 */
public class T06_vote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalNum = scanner.nextInt();
		if (totalNum < 2 || totalNum > 1000) {
			throw new IndexOutOfBoundsException("数量不能小于2或大于1000");
		}
		if(totalNum%2==0){
			throw new IndexOutOfBoundsException("输入的数必须是奇数");
		}

		String votes = scanner.next();
		String[] splitVotes = votes.split("");
		int countA = 0;
		int countB = 0;
		for (String vote:splitVotes) {
			if(vote.equals("A")) countA++;
			if(vote.equals("B")) countB++;
		}

		if(countA>countB){
			System.out.println("A");
		}else {
			System.out.println("B");
		}


	}
}
