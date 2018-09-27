package cn.pintia;

import java.util.Scanner;

public class PAT_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings1 = scanner.nextLine().split(" ");
		int n = Integer.parseInt(strings1[0]);
		int p = Integer.parseInt(strings1[1]);
		String[] strings = scanner.nextLine().split(" ");
		for(int i=(n-p);i<n;i++){
			System.out.print(strings[i]+" ");
		}
		for(int i=0;i<(n-p);i++){
			System.out.print(strings[i]);
			if (i!=(n-p-1)) {
				System.out.print(" ");
			}
		}
		//2  测试点1，2
//		for(int i = 0;i<n;i++){
//			if (i<p) {
//				System.out.print(strings[n-p+i]);
//			}else {
//				System.out.print(strings[i-p]);
//			}
//			if (i!=(n-1)) {
//				System.out.print(" ");
//			}
//		}
		//1 测试点1，2
//		int[] arr = new int[n];
//		for(int i=0;i<n-p;i++){
//			arr[i+p] = Integer.parseInt(strings[i]);
//		}
//		for(int i = (n-p);i<n;i++){
//			arr[i-(n-p)] = Integer.parseInt(strings[i]);
//		}
//		for(int i=0;i<n;i++){
//			System.out.print(arr[i]);
//			if (i!=(n-1)) {
//				System.out.print(" ");
//			}
//		}
	}

}
