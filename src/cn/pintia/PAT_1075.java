package cn.pintia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class PAT_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		String startAddress = strings[0];
		int N = Integer.parseInt(strings[1]);
		int K = Integer.parseInt(strings[2]);
		Map<String, Integer> map = new HashMap<>();
		Element[] element = new Element[N];
		for(int i=0;i<N;i++){
			String[] stringTemp = scanner.nextLine().split(" ");
			map.put(stringTemp[0],Integer.parseInt(stringTemp[1]));
			element[i].setAddress(stringTemp[0]);
			
		}
		
		ArrayList<Element> list1 = new ArrayList<>();
		ArrayList<Element> list2 = new ArrayList<>();
		ArrayList<Element> list3 = new ArrayList<>();
		
		int l1 = 0;
		boolean isl1 = true;
		int ll1 = 0;
		int l2 = 0;
		int ll2 = 0;
		boolean isl2 = true;
		
		for(int i=0;i<N;i++){
			Element
			if (map.get(startAddress) == K) {
				list2.add(e);
			}else{
				if (e.getData() < K) {
					if ((isl1)&(e.getData() >= 0)) {
						list1.add(e);
						l1 = ll1;
						isl1 = false;
					}else if ((!isl1)&(e.getData()>=0)) {
						list1.add(e);
					}else if (e.getData() < 0) {
						if (!isl1) {
							list1.add(l1, e);
							l1++;
						}else{
							list1.add(e);
						}
					}	
				}else if (e.getData() > K) {
					if ((isl2)&(e.getData() >= 0)) {
						list2.add(e);
						l2 = ll2;
						isl2 = false;
					}else if ((!isl2)&(e.getData() >= 0)) {
						list2.add(e);
					}else if (e.getData() < 0) {
						if (!isl2) {
							list2.add(l2, e);
							l2++;
						}else{
							list2.add(e);
						}
					}	
				}
			}
		}
		String addressT = "";
		for(int i=0;i<list1.size();i++){
			if (i != list1.size()) {
				System.out.println(list1.get(i).getAddress()+" "+list1.get(i).getData()+" "+list1.get(i+1).getAddress());
			}else{
				System.out.println(list1.get(i).getAddress()+" "+list1.get(i).getData()+" "+list2.get(0).getAddress());
			}
		}
		if (list3.get(0)!=null) {
			System.out.println(list2.get(0).getAddress()+" "+list2.get(0).getData()+" "+list3.get(0).getAddress());
			for(int i=0;i<list3.size();i++){
				if (i != list3.size()) {
					System.out.println(list3.get(i).getAddress()+" "+list3.get(i).getData()+" "+list3.get(i+1).getAddress());
				}else{
					System.out.println(list3.get(i).getAddress()+" "+list3.get(i).getData()+" -1");
				}
			}
		}else{
			System.out.println(list2.get(0).getAddress()+" "+list2.get(0).getData()+" -1");
		}
		
		
	}

}
class Element{
	private String address;
	private int data;
	private Element next;
	public Element(){
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	
	
}
