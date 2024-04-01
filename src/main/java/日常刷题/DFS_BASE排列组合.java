package 日常刷题;

import java.util.*;

/**
 * 输入abc，给出所有排列组合
 *
 * @author : bugu
 * @date : 2024-04-01 10:42
 */
public class DFS_BASE排列组合 {

	public static void dfs(char[] p, boolean[] pb, int level, Stack<Character> result) {
		//1.截止条件
		if (level == p.length+1 ) {
			System.out.println(result.toString());
			return;
		}

		//2.遍历候选节点
		for (int i = 0; i < p.length; i++) {
			char c = p[i];

			//2.1筛选
			if (!pb[i]) {
				result.push(c);
				pb[i] = true;
				dfs(p, pb, level + 1, result);

				result.pop();
				pb[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		char[] p = {'a', 'b', 'c'};
		Stack<Character> result = new Stack<>();
		boolean[] pb = new boolean[p.length];
		dfs(p, pb, 1, result);
	}
}
