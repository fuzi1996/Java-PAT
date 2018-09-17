package cn.pintia;

/**
 * 1082. 射击比赛
 * 注意：
 * 		测试点2 答案错误
 * 		测试点3 运行超时
 * @author 11829
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.spi.DirStateFactory.Result;

import java.util.Scanner;

public class PAT_1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		List<String> resultList = new ArrayList<>();
		Map<String, Integer> resultMap = new HashMap<>();
		for(int i=0;i<num;i++)
		{
			String string = scanner.nextLine();
			String[] stringArray=string.split(" ");
			int score = Math.abs(Integer.parseInt(stringArray[1]))+Math.abs(Integer.parseInt(stringArray[2]));
			if (i==0) {
				resultMap.put(stringArray[0],score);
				resultList.add(stringArray[0]);
			}else if (i==1) {
				if (score <= resultMap.get(resultList.get(0))) {
					resultMap.put(stringArray[0],score);
					resultList.add(stringArray[0]);
				}else {
					resultMap.put(stringArray[0],score);
					resultList.add(0, stringArray[0]);	
				}
			}else {
				if (score<resultMap.get(resultList.get(1))) {
					resultMap.remove(resultList.get(1));
					resultMap.put(stringArray[0],score);
					resultList.remove(1);
					resultList.add(stringArray[0]);
				}else if (score>resultMap.get(resultList.get(0))) {
					resultMap.remove(resultList.get(0));
					resultMap.put(stringArray[0],score);
					resultList.remove(0);
					resultList.add(0, stringArray[0]);
				}
			}
		}
		for(int i=resultList.size()-1;i>-1;i--)
		{
			if (i!=0) {
				System.out.print(resultList.get(i)+" ");
			}else {
				System.out.print(resultList.get(i));
			}
			
		}
				
	}

}
