package cn.pintia;

import java.util.Scanner;

public class PAT_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings=scanner.nextLine().split(" ");
		for(int i = strings.length-1;i>=0;i--){
			System.out.print(strings[i]);
			if (i!=0) {
				System.out.print(" ");
			}
		}
	}

}
