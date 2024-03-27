package 模拟评测.第五套试题;

/**
 * 问题描述
 * 在数列a[1],a[2],...,a[n]中，如果对于下标i,j,k满足0<i<j<k<n+1且a[i],a[j],a[k]三个数互不相同，则称a[i],a[j],a[k]为一组不等三元组。给定一个数列，请问序列中有多少个不等三元组？
 * 输入格式
 * 输入的第一行包含一个整数n。第二行包含n个整数a[1],a[2],...,a[n]，相邻的整数间用空格分隔，表示给定的数列。
 * 输出格式
 * 输出一行包含一个整数，表示答案。
 *
 * @author : bugu
 * @date : 2024-03-23 10:58
 */
public class T09_triad {
//	typedef long long LL;
//	const int maxN = 100005;
//
//	int N, a[maxN];
//
//	public static void main(String[] args) {
//		scanf("%d", &N);
//		for (int i = 1; i <= N; ++ i) scanf("%d", a+i);
//
//		sort(a+1, a+N+1);
//
//		int low = 1;
//
//		long ans = 0;
//		while (true) {
//			int high = low;
//			while (high+1 <= N && a[high + 1] == a[low]) ++ high;
//			ans = ans + LL(high - low + 1) * (low - 1) * (N - high);
//			low = high + 1;
//			if (low > N) break;
//		}
//
//		System.out.println("%lld", ans);
//	}

}
