package cn.pintia;
/**
 * 1089
 * 遍历，把所有狼人组合的情况遍历一遍，他们的所有回答满足以下两种情况：
 * 1.只有两人说假话
 * 2.一个狼人说假话
 */
import java.util.Scanner;

public class PAT_1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] int_arrs = new int[n];
		for(int i=0;i<n;i++){
			int_arrs[i] = Integer.parseInt(scanner.nextLine());
		}
		int[] result = {1000,1000};
		
		for(int i=n-1;i>-1;i--){	
			for(int ii=i-1;ii>-1;ii--){
				int lie = 0;
				int walfLie = 0;
				//int_arrs[i],int_arrs[ii] should be <0;
				//others should be >0
				for(int iii=0;iii<n;iii++){
					if((Math.abs(int_arrs[iii]) == (i+1))&&(int_arrs[iii] > 0)){
						if ((iii == i)||iii == ii) {
							walfLie++;
						}
						lie++;
					}
					if((Math.abs(int_arrs[iii]) == (ii+1))&&(int_arrs[iii] > 0)){
						if ((iii == i)||iii == ii) {
							walfLie++;
						}
						lie++;
					}
					if((Math.abs(int_arrs[iii]) != (i+1))&&(int_arrs[iii] < 0)&&(Math.abs(int_arrs[iii]) != (ii+1))){
						if ((iii == i)||iii == ii) {
							walfLie++;
						}
						lie++;
					}
				}
				if ((lie == 2)&&(walfLie == 1)) {
					if (ii<=result[0]) {
						result[0] = ii;
						result[1] = i;
					}
				}
			}
		}
		if (result[0] != 1000) {
			System.out.println((result[0]+1)+" "+(result[1]+1));
		}else{
			System.out.println("No Solution");
		}
		
	}

}
