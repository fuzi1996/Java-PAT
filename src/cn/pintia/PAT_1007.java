package cn.pintia;
/**
 * 1007
 * 超时
 */
import java.util.Scanner;

public class PAT_1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] arr = getNum(n);
		int index = 0;
		for(int i =0;(i<arr.length-1)&(arr[i]!=0);i++){
			if ((arr[i+1]-arr[i])==2) {
				index++;
			}
		}
		System.out.println(index);
		
		
	}
	public static int[] getNum(int n){
		int[] arr=new int[n];
		if ((n==1)|(n==2)|(n==3)) {
			for(int i = 1;i<=n;i++){
				arr[i-1] = i;
			}
		}else {
			int index = 0;
			for(int i=1;i<=n;i++){
				if ((i==1)|(i==2)) {
					arr[index++] = i;
				}else {
					int flag = 0;
					for(int ii=1;ii<=i/2+1;ii++){
						if ((i%ii)==0) {
							flag++;
						}
					}
					if (flag==1) {
						arr[index++] = i;
					}
				}
			}
		}
		return arr;
	}

}
