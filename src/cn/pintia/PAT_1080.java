package cn.pintia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 1080
 * 这道题有以下几个注意点：
 * 1.期末成绩的判定：
 * 		如果 G期中 > G期末，总评成绩的计算公式为 G = (G期中x 40% + G期末x 60%)
 * 		否则总评 G 就是 G期末
 * 2.输出顺序为按照总评分数（四舍五入精确到整数）递减。若有并列，则按学号递增
 * 注意：测试点3运行超时
 * @author 11829
 *
 */

public class PAT_1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String firstline = scanner.nextLine();
		String[] strings = firstline.split(" ");
		Map<String, Integer> pNs = new HashMap<String, Integer>();
		Map<String, Integer> mNs = new HashMap<String, Integer>();
		Map<String, Integer> nNs = new HashMap<String, Integer>();
		
		for(int i=0;i<3;i++)
		{
			for(int index=0;index<Integer.parseInt(strings[i]);index++)
			{
				String[] scan = scanner.nextLine().split(" ");
				if (i==0) {
					if(Integer.parseInt(scan[1]) >= 200)
					{
						pNs.put(scan[0], Integer.parseInt(scan[1]));
					}
				}else if(i==1) {
					if (pNs.containsKey(scan[0])) {
						mNs.put(scan[0], Integer.parseInt(scan[1]));
					}
				}else if(i==2) {
					if (pNs.containsKey(scan[0])) {
						nNs.put(scan[0], Integer.parseInt(scan[1]));
					}
				}
			}	
		}
		Map<String, Integer> endNs = new HashMap<>();
		for(String name:pNs.keySet())
		{
			int ms,ns,ends;
			if (mNs.containsKey(name)) {
				ms=mNs.get(name);
			}else {
				ms = -1;
				mNs.put(name, ms);
			}
			if (nNs.containsKey(name)) {
				ns=nNs.get(name);
			}else {
				ns = -1;
				nNs.put(name, ns);
			}
			if (ms > ns) {
				ends = (int) Math.round(ms*0.4+ns*0.6);
			}else {
				ends = ns;
			}
			if (ends > 59) {
				endNs.put(name, ends);
			}
		}
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(endNs.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
		            public int compare(Entry<String,Integer> o1,Entry<String,Integer> o2) {
		                if(o1.getValue().equals(o2.getValue())){
		                    return o1.getKey().compareTo(o2.getKey());
		                }else{
		                    return -(o1.getValue().compareTo(o2.getValue()));
		                }
		            }
		        });
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getKey()+" "+pNs.get(list.get(i).getKey())+" "+mNs.get(list.get(i).getKey())+" "+nNs.get(list.get(i).getKey())+" "+list.get(i).getValue());
		}
		
	}

}
