package leetcode101.贪心算法;

import java.util.Scanner;

/**
 * 分配问题（难度：容易）
 * 题目描述
 * 有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。
 * 每个孩子只能吃 最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩子可以吃饱。
 * <p>
 * 输入输出样例
 * 输入两个数组，分别代表孩子的饥饿度和饼干的大小。输出最多有多少孩子可以吃饱的数量。
 * Input: [1,2], [1,2,3] Output: 2
 * 在这个样例中，我们可以给两个孩子喂 [1,2]、[1,3]、[2,3] 这三种组合的任意一种。
 *
 * @author : bugu
 * @date : 2024-03-23 08:56
 */
public class AssignCookies {

	public static void main(String[] args) {
		//输入
		int[] children = {1, 2};//孩子的饥饿度
		int[] cookies = {1, 2, 3, 4};//饼干大小

		//输出

	}

	int findContentChildren(int[] children, int[] cookies) {

		for (int i = 0; i < children.length; i++) {
			int oneChild = children[i];
			for (int j = 0; j < cookies.length; j++) {
				int cookie = cookies[j];
				if (oneChild==cookie){

				}
			}



		}


		return 0;

	}
}
