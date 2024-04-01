package 模拟评测.第五套试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 请填写说明
 *
 * @author : bugu
 * @date : 2024-03-27 21:15
 */

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String str=scan.nextLine();
		int aCount=0;
		int bCount=0;

		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(c=='A') {
				aCount++;
			}else {
				bCount++;
			}
		}

		if(aCount>bCount) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}


}