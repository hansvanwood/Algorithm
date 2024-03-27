package 模拟评测.第五套试题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述
 * 给定一个 n * m 的矩阵表示 Excel 表格中的数据，行号从上到下按数字 1, 2, 3, ... 编号，列号从左到 右按大写字母 A, B, C, ... 编号。一个单元格用列号和行号相连表示。
 * 例如，第 3 行第 5 列编号为 E3，第 20 行第 3 列编号为 C20。
 * 给定一个 Excel 中的加法公式，公式第一个字符一定为等号，后面只包含单元格的名称和加号，且 单元格名称不相邻，加号的两边都是单元格名称。请计算加法的结果。
 * <p>
 * 输入格式
 * 输入的第一行包含两个整数 n, m，用一个空格分隔。
 * 接下来 n 行，每行 m 个整数，表示给定的数据。
 * 接下来一行包含一个 Excel 中的加法公式。
 * <p>
 * 输出格式
 * 输出一行包含一个整数，表示答案。
 *
 * @author : bugu
 * @date : 2024-03-23 10:35
 */
public class T08_excel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		List<List<Integer>> data = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> oneLineData = new ArrayList<>();
			String[] split = scanner.nextLine().split("\\s+");
			for (int j = 0; j < split.length; j++) {
				int cellData = Integer.parseInt(split[j]);
				oneLineData.add(cellData);
			}
			data.add(oneLineData);
		}

		String formula = scanner.nextLine();
		String[] cells = formula.replace("=", "").split("\\+");
		int result = 0;
		for (String cell : cells) {
			result += findDataInCell(data, cell);
		}
		System.out.println(result);
	}

	private static int findDataInCell(List<List<Integer>> data, String cell) {
		String cloumnNumber = cell.replaceAll("[0-9]", "");
		String rowNumber = cell.replaceAll("[A-Z|a-z]", "");
		int cloumn = cloumnNumber.toCharArray()[0] - 65;
		int row = Integer.parseInt(rowNumber);

		return data.get(row-1).get(cloumn);
	}
}
