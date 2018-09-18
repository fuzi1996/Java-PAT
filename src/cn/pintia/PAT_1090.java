package cn.pintia;
/**
 * 1090
 * 第三第四测试点数据量很大，要么超时，要么内存超限
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PAT_1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		int N = Integer.parseInt(strings[0]);
		int M = Integer.parseInt(strings[1]);
		
		Map<String, ArrayList<String>> map = new HashMap();
		for(int i=0;i<N;i++){
			String[] temp = scanner.nextLine().split(" ");
			if (map.containsKey(temp[0])) {
				map.get(temp[0]).add(temp[1]);
			}else {
				ArrayList<String> list_t = new ArrayList<String>();
				list_t.add(temp[1]);
				map.put(temp[0],list_t);
			}
			if (map.containsKey(temp[1])) {
				map.get(temp[1]).add(temp[0]);
			}else {
				ArrayList<String> list_t = new ArrayList<String>();
				list_t.add(temp[0]);
				map.put(temp[1],list_t);
			}
		}
		
		ArrayList<String[]> nArrayList = new ArrayList<>();
		for(int i=0;i<M;i++){
			String[] temp = scanner.nextLine().split(" ");
			int int_t = Integer.parseInt(temp[0]);
			String[] iStrings = new String[int_t];
			for(int ii=1;ii < temp.length;ii++){
				iStrings[ii-1] = temp[ii];
			}
			nArrayList.add(iStrings);
		}
		
		for(int i=0;i < nArrayList.size();i++){
			System.out.println(getResult(map, nArrayList.get(i)));
		}
		

	}
	public static String getResult(Map<String, ArrayList<String>> map,String[] strings){
		String result = "Yes";
		for(int i = 0;i<strings.length;i++){
			if (map.containsKey(strings[i])) {
				ArrayList<String> temp = map.get(strings[i]);
				for(int ii = i+1;ii<strings.length;ii++){
						for(int iii=0;iii<temp.size();iii++){
							if (temp.get(iii).equals(strings[ii])) {
								result = "No";
							}
						}
				}	
			}
		}
		return result;
	}

}
