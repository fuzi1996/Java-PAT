package cn.pintia;
/**
 * 未完成
 */
import java.util.Scanner;

public class PAT_1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++){
			String string = scanner.nextLine();
			int flag1 = 0;
			int flag2 = 0;
			int flag3 = 0;
			boolean isyes = true;
			int index = 0;
			char[] cs = string.toCharArray();
			char[] a = new char[100];
			if (cs[0] == 'P') {
				if((cs[1]=='A')&(cs[2]=='T')&(cs.length == 3)){
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				boolean at = true;
				for(char c:cs){
					if(c == 'A'){
//						if()
						flag2++;
					}else if(c == 'T'){
						if (flag1 == 1) {
							flag3++;
						}else {
							isyes = false;
						}
					}else{
						isyes = false;
					}
				}
			}
			
			if (isyes == false) {
				System.out.println("NO");
			}else {
				if (((flag1*flag2*flag3)>0)&(flag1 == 1)&(flag3 == 1)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}
	}

}
