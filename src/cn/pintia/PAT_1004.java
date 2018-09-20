package cn.pintia;
/**
 * 测试点1为 n=1
 */
import java.util.Scanner;

public class PAT_1004 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		if (n == 1) {
			String[] strings2 = scanner.nextLine().split(" ");
			System.out.println(strings2[0]+" "+strings2[1]);
			System.out.println(strings2[0]+" "+strings2[1]);
		}else {
			String[][] strings = new String[2][3];
			for(int i=0;i<n;i++){
				String[] strings2 = scanner.nextLine().split(" ");
				if(i < 2){
					if (i == 0) {
						strings[0][0] = strings2[0];
						strings[0][1] = strings2[1];
						strings[0][2] = strings2[2];
					}else if(i == 1){
						if (Integer.parseInt(strings2[2]) > Integer.parseInt(strings[0][2])) {
							strings[1][0] = strings[0][0];
							strings[1][1] = strings[0][1];
							strings[1][2] = strings[0][2];
							strings[0][0] = strings2[0];
							strings[0][1] = strings2[1];
							strings[0][2] = strings2[2];
						}else {
							strings[1][0] = strings2[0];
							strings[1][1] = strings2[1];
							strings[1][2] = strings2[2];
						}
					}
				}else{
					if (Integer.parseInt(strings2[2]) > Integer.parseInt(strings[0][2])) {
						strings[0][0] = strings2[0];
						strings[0][1] = strings2[1];
						strings[0][2] = strings2[2];
					}else if(Integer.parseInt(strings2[2]) < Integer.parseInt(strings[1][2])){
						strings[1][0] = strings2[0];
						strings[1][1] = strings2[1];
						strings[1][2] = strings2[2];
					}
				}
			}
			System.out.println(strings[0][0]+" "+strings[0][1]);
			System.out.println(strings[1][0]+" "+strings[1][1]);
		}
	}
}

