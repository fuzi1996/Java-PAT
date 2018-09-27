package cn.pintia;

import java.util.Scanner;

public class PAT_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		String[] strings2 = new String[strings.length];
		int index = 0;
		// for(int i = 0;i<strings.length-1;i+=2){
		// 	strings2[i] = Integer.toString(Integer.parseInt(strings[i])*Integer.parseInt(strings[i+1]));
		// 	strings2[i+1] = Integer.toString(Integer.parseInt(strings[i+1])-1);
		// 	if (Integer.parseInt(strings2[i+1])<0) {
		// 		strings2[i+1]="0";
		// 	}
		// 	index = i+1;
		// }
		// for(int i = 0;i<strings.length-1;i+=2){
		// 	if (null!=strings2[i]) {
		// 		System.out.printf("%s %s",strings2[i],strings2[i+1]);
		// 	}
		// 	if ((i<(index-1))) {
		// 		System.out.print(" ");
		// 	}
		// }
		for(int i = 0;i<strings.length-1;i+=2){
			if (!strings[i+1].equals("0")) {
				strings2[i] = Integer.toString(Integer.parseInt(strings[i])*Integer.parseInt(strings[i+1]));
				strings2[i+1] = Integer.toString(Integer.parseInt(strings[i+1])-1);
				index = i+1;
			}
			if (Integer.parseInt(strings2[i+1])<0) {
				strings2[i+1]="0";
			}
		}
		for(int i = 0;i<strings.length-1;i+=2){
			if (null!=strings2[i]) {
				System.out.printf("%s %s",strings2[i],strings2[i+1]);
			}
			if ((i<(index-1))) {
				System.out.print(" ");
			}
		}
	}

}
