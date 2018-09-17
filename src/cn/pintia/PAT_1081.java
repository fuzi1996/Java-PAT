package cn.pintia;
/**
 * 1081. 检查密码

 * 注意：
 * 		这道题有问题，如果我输入为"........."，该怎么输出，没说，幸好测试点也没测试
 * 		使用异或
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PAT_1081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		List<String> scannerlist=new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			String string = scanner.nextLine();
			scannerlist.add(string);
		}
		for (String string:scannerlist) {
			char[] charArray = string.toCharArray();
			if (charArray.length<6) {
				System.out.println("Your password is tai duan le.");
			}else {
				if (islegal(charArray)==1) {
					System.out.println("Your password is wan mei.");
				}else if (islegal(charArray)==3) {
					System.out.println("Your password is tai luan le.");
				}else if (islegal(charArray)==4) {
					System.out.println("Your password needs shu zi.");
				}else if (islegal(charArray)==5) {
					System.out.println("Your password needs zi mu.");
				}
			}
		
		}
			
	}
	public static int islegal(char[] charArray)
	{
		int index = 0;
		int num1=-1;
		int num2=-1;
		for(int i=0;i<charArray.length;i++)
		{
			if (Character.isLetterOrDigit(charArray[i])|String.valueOf(charArray[i]).equals(".")) {
				if (Character.isDigit(charArray[i])) {
					num1 = 15;
				}else if (Character.isLetter(charArray[i])) {
					num2 = 0;
				}
			}else {
				index = 3;
				break;
			}
		}
		if (index==0) {
			if ((num1^num2) == 15) {
				index=1;
			}else{
				if (num1==15) {
					index = 5;
				}else if (num2==0) {
					index = 4;
				}
			}
		}
		return index;
	}

}
