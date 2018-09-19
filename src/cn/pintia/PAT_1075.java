package cn.pintia;
/**
 * 测试点2：
 * 		00000 1 1
 *		00000 1 -1
 *
 *		00000 2 1
 *		00000 1 00001
 *		00001 2 -1
 *
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PAT_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		String startAddress = strings[0];
		int N = Integer.parseInt(strings[1]);
		int K = Integer.parseInt(strings[2]);
		new HashMap<>();
		Element[] element = new Element[100000];
		for(int i=0;i<N;i++){
			String[] stringTemp = scanner.nextLine().split(" ");
			element[Integer.parseInt(stringTemp[0])] = new Element();
			element[Integer.parseInt(stringTemp[0])].setData(Integer.parseInt(stringTemp[1]));
			element[Integer.parseInt(stringTemp[0])].setNext(stringTemp[2]);			
		}
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		while(!startAddress.equals("-1")){
			int temp = element[Integer.parseInt(startAddress)].getData();
			if (temp < 0) {
				list1.add(startAddress);
			}else if ((temp>=0)&&(temp<=K)) {
				list2.add(startAddress);
			}else {
				list3.add(startAddress);
			}
			startAddress = element[Integer.parseInt(startAddress)].getNext();
		}
		int flag = 0;
		for(int i = 0;i<3;i++){
			for(int j=0;j<list.get(i).size();j++){
				if (flag == 0) {
					System.out.printf("%s %d ",list.get(i).get(j),element[Integer.parseInt(list.get(i).get(j))].getData());
					flag = 1;
				}else {
					System.out.printf("%s%n%s %d ",list.get(i).get(j),list.get(i).get(j),element[Integer.parseInt(list.get(i).get(j))].getData());
				}
			}
		}
		System.out.println("-1");
//		if (list1.size()==1) {
//			System.out.println(list1.get(list1.size()-1)+" "+element[Integer.parseInt(list1.get(list1.size()-1))].getData()+" "+list2.get(0));
//		}else if (list1.size()>1) {
//			for (int i = 0; i < list1.size()-1; i++) {
//				System.out.println(list1.get(i)+" "+element[Integer.parseInt(list1.get(i))].getData()+" "+list1.get(i+1));
//			}
//			System.out.println(list1.get(list1.size()-1)+" "+element[Integer.parseInt(list1.get(list1.size()-1))].getData()+" "+list2.get(0));
//		}
//		if (list2.size() == 1) {
//			if (list3.size()>0) {
//				System.out.println(list2.get(list2.size()-1)+" "+element[Integer.parseInt(list2.get(list2.size()-1))].getData()+" "+list3.get(0));
//				if (list3.size() == 1) {
//					System.out.println(list3.get(list3.size()-1)+" "+element[Integer.parseInt(list3.get(list3.size()-1))].getData()+" -1");
//				}else if (list3.size()>1) {
//					for (int i = 0; i < list3.size()-1; i++) {
//						System.out.println(list3.get(i)+" "+element[Integer.parseInt(list3.get(i))].getData()+" "+list3.get(i+1));
//					}
//					System.out.println(list3.get(list3.size()-1)+" "+element[Integer.parseInt(list3.get(list3.size()-1))].getData()+" -1");
//				}
//			}else {
//				System.out.println(list2.get(list2.size()-1)+" "+element[Integer.parseInt(list2.get(list2.size()-1))].getData()+" -1");
//			}
//		}else if (list2.size() > 1) {
//			for (int i = 0; i < list2.size()-1; i++) {
//				System.out.println(list2.get(i)+" "+element[Integer.parseInt(list2.get(i))].getData()+" "+list2.get(i+1));
//			}
//			if (list3.size()>0) {
//				System.out.println(list2.get(list2.size()-1)+" "+element[Integer.parseInt(list2.get(list2.size()-1))].getData()+" "+list3.get(0));
//				if (list3.size() == 1) {
//					System.out.println(list3.get(list3.size()-1)+" "+element[Integer.parseInt(list3.get(list3.size()-1))].getData()+" -1");
//				}else if (list3.size()>1) {
//					for (int i = 0; i < list3.size()-1; i++) {
//						System.out.println(list3.get(i)+" "+element[Integer.parseInt(list3.get(i))].getData()+" "+list3.get(i+1));
//					}
//					System.out.println(list3.get(list3.size()-1)+" "+element[Integer.parseInt(list3.get(list3.size()-1))].getData()+" -1");
//				}
//			}else {
//				System.out.println(list2.get(list2.size()-1)+" "+element[Integer.parseInt(list2.get(list2.size()-1))].getData()+" -1");
//			}
//		}

	}

}
class Element{
	private int data;
	private String next;
	public Element(){
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	
	
}
