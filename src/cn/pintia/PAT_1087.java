package cn.pintia;

import java.util.Scanner;

/*
 * 1087
 */
public class PAT_1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N*3];
		for(int i = 1;i<=N;i++){
			long sum = Math.round(i/2)+Math.round(i/3)+Math.round(i/5);
			arr[(int)sum] = 1;
		}
		int total = 0;
		for(int i = 0;i<arr.length;i++){
			if (arr[i] != 0) {
				total++;
			}
		}
		System.out.println(total);
		
	}

}
