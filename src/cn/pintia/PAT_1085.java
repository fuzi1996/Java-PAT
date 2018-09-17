package cn.pintia;
/**
 * 1085
 * 注意：
 * 		测试点4，5超时
 * 		注意list 比较器的写法
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PAT_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int index = 0;
		//�洢ѧУ��Ϣ
		List<School> schoolList = new ArrayList<>();
		//�洢ѧУ��list����λ��
//		Map<String,Integer> nameMap = new HashMap<>();
		while (index<n) {
			int temp=0;
			String[] stringArray = scanner.nextLine().split(" ");
			String school = stringArray[2].toLowerCase();
			int score=0;
			if (stringArray[0].startsWith("B")) {
				score = (int)(Double.parseDouble(stringArray[1])/1.5);
			}else if (stringArray[0].startsWith("A")) {
				score = (int)(Double.parseDouble(stringArray[1]));
			}else if (stringArray[0].startsWith("T")) {
				score = (int)(Double.parseDouble(stringArray[1])*1.5);
			}
			if (schoolList.size()>0) {
				int tempint = 0;
				for(int i=0;i<schoolList.size();i++)
				{
					if (schoolList.get(i).getName().equals(school)) {
						int people = schoolList.get(i).getPeople()+1;
						int scoreAdded = schoolList.get(i).getScore()+score;
						School schoolAdded = new School(school,scoreAdded,people);
						schoolList.remove(i);
						schoolList.add(schoolAdded);
						tempint=1;
						break;
					}
				}
				if (tempint==0) {
					schoolList.add(new School(school, score, 1));
				}
				
			}else {
				schoolList.add(new School(school, score, 1));
			}
			index++;
		}
		
		Collections.sort(schoolList, new Comparator<School>() {
			@Override
			public int compare(School o1, School o2) {
				// TODO Auto-generated method stub
				if (o1.getScore()==o2.getScore()) {
					if (o1.getPeople()==o2.getPeople()) {
						return o1.getName().compareTo(o2.getName());
					}else {
						return o1.getPeople()-o2.getPeople();
					}
				}else {
					return -(o1.getScore()-o2.getScore());
				}
			}
		});
		System.out.println(schoolList.size());
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<schoolList.size();i++)
		{
			if (i==0) {
				map.put(schoolList.get(0).getScore(),1);
			}else {
				if (!(schoolList.get(i).getScore()==schoolList.get(i-1).getScore())) {
					map.put(schoolList.get(i).getScore(),i+1);
				}
			}
		}
		for (School school:schoolList) {
			System.out.println(map.get(school.getScore())+" "+school.getName()+" "+Integer.valueOf(String.valueOf(school.getScore()))+" "+school.getPeople());
		}	
	}

}
class School{
	public String name;
	public int score;
	public int people;
	public School(String name,int score,int people) {
		this.name=name;
		this.score=score;
		this.people=people;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
}
