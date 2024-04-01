package 日常刷题;

import java.util.*;

/**
 * 输入abc，给出所有排列组合
 *
 * @author : bugu
 * @date : 2024-04-01 10:42
 */
public class DFS_BASE排列组合 {

    /**
     * 深度优先搜索
     *
     * @param p      给定的字符数组
     * @param pb     与p长度相同，存储是否遍历过数组中的元素
     * @param level  当前遍历的层级
     * @param result 答案
     */
    public static void dfs(char[] p, boolean[] pb, int level, Stack<Character> result) {
        //1.截止条件：当层级与p长度相同时，说明所有字符已经遍历完
        if (level == p.length + 1) {
            System.out.println(result.toString());//打印组合情况
            return;//停止遍历
        }

        //2.遍历候选节点：每次只取一个元素
        for (int i = 0; i < p.length; i++) {
            char c = p[i];//取出来的元素->单个字母

            //2.1 筛选
            if (!pb[i]) {//递归

                result.push(c);//添加元素到结果中
                pb[i] = true;//标记当前元素已被用过
                dfs(p, pb, level + 1, result);//层级+1，继续遍历

                //上一行代码，等待所有元素遍历完，递归完成后，回退一级
                result.pop();//取出元素
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
