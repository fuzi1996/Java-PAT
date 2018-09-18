package cn.pintia;
/**
 * 1088
 * 第四条测试点 48 11 2
 */

import java.util.Scanner;

public class PAT_1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		int you = Integer.parseInt(strings[0]);
		int X = Integer.parseInt(strings[1]);
		int Y = Integer.parseInt(strings[2]);
		int xx = 0;
		int yy = 0;
		double zz = 0;
		for(int i = 10;i<100;i++){
			int y = getResolveI(i);
			double z = Math.abs(i - y) / (X*1.0);
			
			if ((z*Y) == y) {
				xx=i;
				yy=y;
				zz=z;
			}
		}
		if (xx == 0) {
			System.out.println("No Solution");
		}else {
			System.out.println(xx+" "+getReturnStr(you, xx)+" "+getReturnStr(you, yy)+" "+getReturnStr(you, zz));
		}
	}
	public static int getResolveI(int i){
		StringBuilder sbBuilder = new StringBuilder();
		while (i>9) {
			sbBuilder.append(Integer.toString(i%10));
			i /= 10;
		}
		sbBuilder.append(Integer.toString(i));
		
		return Integer.parseInt(sbBuilder.toString());
	}
	public static String getReturnStr(int you,int n){
		String string = "Ping";
		if (you < n) {
			string = "Cong";
		}else if (you > n) {
			string = "Gai";
		}
		return string;
	}
	public static String getReturnStr(int you,double n){
		String string = "Ping";
		if (you < n) {
			string = "Cong";
		}else if (you > n) {
			string = "Gai";
		}
		return string;
	}

}


