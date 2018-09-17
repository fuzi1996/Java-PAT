package cn.pintia;
/**
 * 1079. 延迟的回文数
 * 注意：
 * 		输入不超过1000位，故不能将其简单的看做int相加
 * 		当输入为单个数字时，输出 该数字+" is a palindromic number." 测试点2，3，4
 */
import java.util.Scanner;

public class PAT_1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		if(isPalindrome(num))
		{
			System.out.println(num+" is a palindromic number.");
		}else {
			int n = 0;
			
			while (n<10) {
				StringBuffer sBuffer = new StringBuffer();
				String temp = new StringBuffer(String.valueOf(num)).reverse().toString();
				char[] numCharArray = num.toCharArray();
				char[] numCharArray2 = temp.toCharArray();
				int carryBit = 0;
				for(int i=numCharArray.length-1;i>-1;i--)
				{
					int sum = Integer.parseInt(String.valueOf(numCharArray[i]))+Integer.parseInt(String.valueOf(numCharArray2[i]))+carryBit;
					if(sum > 9)
					{
						carryBit = sum/10;
						sBuffer.append(sum%10);
					}else {
						sBuffer.append(sum);
						carryBit=0;
					}
				}
				if (carryBit!=0) {
					sBuffer.append(carryBit);
				}
				String stringTemp = sBuffer.reverse().toString();
				System.out.println(num+" "+"+"+" "+temp+" "+"="+" "+stringTemp);
				if (isPalindrome(stringTemp)) {
					System.out.println(stringTemp+" is a palindromic number.");
					break;
				}else {
					num = stringTemp;
				}
				n++;
			}
			if (n==10) {
				System.out.println("Not found in 10 iterations.");
			}
		}

	}
	public static boolean isPalindrome(String num)
	{
		//equalsIgnoreCase() ���Դ�Сд
		return new StringBuffer(num).reverse().toString().equalsIgnoreCase(num);
	}

}
