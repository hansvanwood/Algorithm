package 日常刷题;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-04-01 11:10
 */
public class DFS_IP地址 {

	public static void dfs(String str, int index, int level, Stack<String> result) {
		//1.截止条件
		if (level == 5 || index == str.length() - 1) {
			if (level == 5 && index == str.length() - 1) {
				System.out.println(result.stream().reduce((a, b) -> a.concat(".").concat(b)).get());
			}
			return;
		}

		//2.候选地址
		for (int i = 1; i < 4; i++) {
			String x = str.substring(index + 1,i);

			//2.1 筛选
			if (Integer.parseInt(x) < 256) {
				if ("0".equals(x) || !x.startsWith("0")) {
					result.push(x);
					dfs(str, index + 1, level + 1, result);
					result.pop();
				}
			}
		}
	}

	public static void main(String[] args) {
		Stack<String> result = new Stack<>();
		dfs("19216801", -1, 1, result);

	}
}
