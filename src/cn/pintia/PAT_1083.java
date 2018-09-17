package cn.pintia;
/**
 * 1083
 * 注意：
 * 		最后一个运行超时
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PAT_1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] stringArray = scanner.nextLine().split(" ");
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if (list.contains(Math.abs(Integer.parseInt(stringArray[i])-i-1))) {
//				replace since 1.8
//				map.replace(Math.abs(Integer.parseInt(stringArray[i])-i-1), map.get(Math.abs(Integer.parseInt(stringArray[i])-i-1)), map.get(Math.abs(Integer.parseInt(stringArray[i])-i-1))+1);
				map.put(Math.abs(Integer.parseInt(stringArray[i])-i-1), map.get(Math.abs(Integer.parseInt(stringArray[i])-i-1))+1);
			}else {
				list.add(Math.abs(Integer.parseInt(stringArray[i])-i-1));
				map.put(Math.abs(Integer.parseInt(stringArray[i])-i-1), 1);
			}
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i:list)
		{
			if (map.get(i)!=1) {
				System.out.println(i+" "+map.get(i));
			}
		}
		

	}

}
