package cn.pintia;
/*
 * 1086
 */
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PAT_1086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		int x = Integer.parseInt(strings[0]);
		int y = Integer.parseInt(strings[1]);
		int xy = x*y;
//		2*5=10 ? 01 ：1
//		String xyString = Integer.toString(xy);
//		for(int i = xyString.length()-1;i>-1;i--){
//			System.out.print(xyString.toCharArray()[i]);
//		}
		System.out.println(getResolveI(xy));
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

}
