package cn.pintia;
/**
 * 1084
 * 注意：
 * 		理解题意是非常重要的
 * 		11121121 下一项是：3112211211，是以不同数字做分割的
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PAT_1084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] firstLineArray = scanner.nextLine().split(" ");
		String string = firstLineArray[0];
		for(int i=1;i<Integer.parseInt(firstLineArray[1]);i++)
		{
			string = apperanceNum(string);
		}
		System.out.println(string);
	}
	public static String apperanceNum(String string){
		StringBuffer stringBuffer = new StringBuffer();
		int temp = 1;
		if (string.length() == 1) {
			stringBuffer.append(String.valueOf(string.charAt(0))+1);
		}else {
			for(int i=0;i<string.length();i++)
			{
				if (i == string.length()-1) {
					stringBuffer.append(String.valueOf(string.charAt(i))+String.valueOf(temp));
				}else {
					if (string.charAt(i)==string.charAt(i+1)) {
						temp += 1;
					}else {
						stringBuffer.append(String.valueOf(string.charAt(i))+String.valueOf(temp));
						temp = 1;
					}
				}							
			}

		}
		return stringBuffer.toString();
	}

}
