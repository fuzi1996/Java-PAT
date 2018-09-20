package cn.pintia;
/**
 * 测试点2，3，4超时
 */
import java.util.Scanner;

public class PAT_1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		String[] strings = scanner.nextLine().split(" ");
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if (Integer.parseInt(strings[j])<=Integer.parseInt(strings[i])) {
					String t = strings[i];
					strings[i] = strings[j];
					strings[j] = t;
				}
			}
		}
		double sum = 0;
		for(int i=0;i<N-1;i++){
			sum = (Integer.parseInt(strings[i])+Integer.parseInt(strings[i+1]))/2;
			strings[i+1] = Integer.toString((int)sum);
		}
		System.out.println(Math.round(sum));
		
		
	}
	public static void quickSort(String[] strings,int i,int j){
		if (i<j) {
			int pivot = partition(strings, i, j);
			quickSort(strings, pivot, pivot-1);
			quickSort(strings, pivot+1, j);
		}
	}
	public static int partition(String[] strings,int i,int j){
		while(i<j){
			while((i<j)&(Integer.parseInt(strings[i])<=Integer.parseInt(strings[j]))){
				j--;
			}
			if(Integer.parseInt(strings[i])>Integer.parseInt(strings[j])){
				String t = strings[i];
				strings[i] = strings[j];
				strings[j] = t;
				i++;
			}
			while((i<j)&(Integer.parseInt(strings[i])<=Integer.parseInt(strings[j]))){
				i++;
			}
			if(i<j){
				String t = strings[i];
				strings[i] = strings[j];
				strings[j] = t;
				j--;
			}
		}
		return i;
	}

}
