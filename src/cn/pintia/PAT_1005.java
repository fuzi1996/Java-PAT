package cn.pintia;

import java.util.Scanner;

public class PAT_1005 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		scanner.nextLine();
		String[] strings = scanner.nextLine().split(" ");
		int[] result = new int[K];
		int r_i = 0;
		for(String string:strings){
			result[r_i++] = Integer.parseInt(string);
		}
		int index = 0;
		for(String string:strings){
			int flag = 0;
			int t = Integer.parseInt(string);
			int[] ts = new int[100];
			int i = 0;
			while(t!=1){
				if((t%2) == 0){
					t = t/2;
					ts[i] = t;
				}else {
					t = ((t*3)+1)/2;
					ts[i] = t;
				}
				i++;
			}
			for(int tt:ts){
				for(int iii = 0;iii<result.length;iii++){
					if (result[iii] == tt) {
						result[iii] = 0;
					}
				}
			}
		}
		for(int ind = 0;ind<result.length;ind++){
			for(int in = ind+1;in<result.length;in++){
				if(result[ind]<=result[in]){
					int t = result[ind];
					result[ind] = result[in];
					result[in] = t;
				}
			}
		}
		for(int inde = 0;inde<result.length-1;inde++){
			if ((result[inde]!=0)&(result[inde+1]!=0)) {
				System.out.printf("%d ",result[inde]);
			}else if (result[inde]!=0) {
				System.out.println(result[inde]);
			}
		}
		
	}

}
