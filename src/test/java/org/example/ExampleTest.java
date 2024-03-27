package org.example;

import org.junit.Test;

/**
 * 问题描述
 * 在数列 a[1], a[2], ..., a[n] 中，
 * 如果对于下标 i, j, k 满足 0<i<j<k<n+1 且 a[i], a[j], a[k] 三个数互不相同，
 * 则称 a[i], a[j], a[k] 为一组不等三元组。
 * <p>
 * 给定一个数列，请问序列中有多少个不等三元组？
 * <p>
 * 输入格式
 * 输入的第一行包含一个整数 n。
 * 第二行包含 n 个整数 a[1], a[2], ..., a[n]，相邻的整数间用空格分隔，表示给定的数列。
 * <p>
 * 输出格式
 * 输出一行包含一个整数，表示答案。
 *
 * @author : bugu
 * @date : 2024-03-23 10:46
 */
public class ExampleTest {

	@Test
	public void test() {
		int cloumn = "A".toCharArray()[0] - 65;
		System.out.println(cloumn);
	}
}
