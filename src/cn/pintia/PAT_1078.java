package cn.pintia;

import java.util.Scanner;

/**
 * 1078
 * 注意：
 * 		压缩 compress
 * 		解压缩 decompress
 *
 * @author 11829
 *
 */
public class PAT_1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String word = scanner.nextLine();
		String[] strings = scanner.nextLine().split(" ");
		if (word.equals("C")) {
			System.out.println(Compress(strings));
		}else if (word.equals("D")) {
			System.out.println(Decompress(strings));
		}
	}
	public static String Compress(String[] strings)
	{
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings[i].toCharArray().length; j++) {
				
			}
		}
		return "";
		
	}
	public static String Decompress(String[] strings)
	{
		StringBuffer sBuffer=new StringBuffer();
		return "";
	}

}
