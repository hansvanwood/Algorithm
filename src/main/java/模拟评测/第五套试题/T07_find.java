package 模拟评测.第五套试题;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 问题描述
 * 小蓝负责管理公司的打卡信息。每条信息包含员工编号（一个整数）、员工姓名（一个只包含大小写英文字母的字符串）、
 * 打卡时 间（一个整数）和打卡地点（一个只包含大小写英文字母的字符串）。
 * 现在，小蓝想找到其中一名员工的打卡信息，请帮助他。
 * <p>
 * 输入格式
 * 输入的第一行包含一个整数 n，表示打卡信息的条数。
 * 第二行开始的 n 行，每行包含一条打卡信息，由员工编号、员工姓名、打卡时间和打卡地点组成。
 * 接下来一行包含一个字符串，表示要查找的员工的姓名。
 * <p>
 * 输出格式
 * 输出多行，每行包含一条打卡信息，按输入的顺序输出。只要该打卡信息中的员工姓名与所查找的 员工姓名一致（包括大小写也一致）就要输出。
 *
 * @author : bugu
 * @date : 2024-03-23 10:17
 */
public class T07_find {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalNum = Integer.parseInt(scanner.nextLine());

		ArrayList<String> clockRecordsList = new ArrayList<>();
		for (int i = 0; i < totalNum; i++) {
			String nextLine = scanner.nextLine();
			clockRecordsList.add(nextLine);
		}
		String employeeName = scanner.next().trim();
		for (String clockRecord : clockRecordsList) {
			String[] split = clockRecord.split("\\s+");
			if (split[1].equals(employeeName))
				System.out.println(clockRecord);
		}


	}

}
