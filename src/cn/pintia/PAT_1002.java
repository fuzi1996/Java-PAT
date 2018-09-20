package cn.pintia;
/**
 * 1002
 * map声明即初始化
 * Map<Character, String> Map = new HashMap<Character, String>(){{put('0',"ling");}};
 * @author 11829
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PAT_1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] numchar = scanner.nextLine().toCharArray();
		Map<Character, String> Map = new HashMap<Character, String>(){{
			put('0',"ling");put('1',"yi");put('2',"er");put('3',"san");put('4',"si");
			put('5',"wu");put('6',"liu");put('7',"qi");put('8',"ba");put('9',"jiu");
		}};
		int sum = 0;
		for(char c:numchar){
			sum += Integer.parseInt(String.valueOf(c));
		}
		char[] sumchar = String.valueOf(sum).toCharArray();
		StringBuffer sBuffer = new StringBuffer();
		for(char c:sumchar){
			sBuffer.append(Map.get(c)+" ");
		}
		String string = sBuffer.substring(0, sBuffer.length()-1);
		System.out.println(string);

	}

}
