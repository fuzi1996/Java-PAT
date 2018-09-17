package cn.pintia;

import java.util.Scanner;

/**
 * 1001
 * @author 11829
 *
 */
public class PAT_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int index = 0;
		while (num != 1) {
			if (num%2 == 0) {
				num = num/2;
			}else {
				num = ((3*num)+1)/2;
			}
			index++;
		}
		System.out.println(index);

	}

}
