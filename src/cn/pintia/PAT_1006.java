package cn.pintia;

import java.util.Scanner;

public class PAT_1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		if (n<10) {
			for(int i=1;i<=n;i++){
				System.out.print(i);
			}
		}else if (n<100) {
			int g = n%10;
			int s = n/10;
			for(int i=0;i<s;i++){
				System.out.print("S");
			}
			for(int i=1;i<=g;i++){
				System.out.print(i);
			}
		}else {
			int g = n%10;
			int s = (n/10)%10;
			int b = n/100;
			for(int i=0;i<b;i++){
				System.out.print("B");
			}
			for(int i=0;i<s;i++){
				System.out.print("S");
			}
			for(int i=1;i<=g;i++){
				System.out.print(i);
			}
			
		}
	}

}
