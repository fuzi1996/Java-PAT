package cn.pintia;
/**
 * 1074 宇宙无敌加法器
 * 注意：
 * 		结果全为0
 * 		进位，特别是n位+n位=(n+1)位
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PAT_1074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] hexCharArray = scanner.nextLine().toCharArray();
		char[] plusCharArray = scanner.nextLine().toCharArray();
		char[] plusCharArray2 = scanner.nextLine().toCharArray();
		List<Integer> hexIntArray = hexchar2int(hexCharArray);
		List<Integer> plusIntArray = char2int(plusCharArray);
		List<Integer> plusIntArray2 = char2int(plusCharArray2);
		List<Integer> sumIntArray = new ArrayList();
		
		int num = plusCharArray.length > plusCharArray2.length ? plusCharArray2.length:plusCharArray.length;
		int numBigger = plusCharArray.length < plusCharArray2.length ? plusCharArray2.length:plusCharArray.length;
		int carryBit = 0;
		//��λ
		while(plusIntArray.size() != numBigger) {
			plusIntArray.add(0);
		}
		while (plusIntArray2.size() != numBigger) {
			plusIntArray2.add(0);
		}
		//�ӷ�����
		int i = 0;
		for(;i<numBigger;i++)
		{
			int sumtemp = plusIntArray.get(i)+plusIntArray2.get(i)+carryBit;
			if (sumtemp<hexIntArray.get(i)) {
				sumIntArray.add(sumtemp);
				carryBit = 0;
			}else {
				carryBit = sumtemp/hexIntArray.get(i);
				sumIntArray.add(sumtemp%hexIntArray.get(i));
			}
		}
		//nλ+nλ=(n+1)λ��������λ
		while (carryBit!=0) {
			if (numBigger<hexIntArray.size()) {
				int sumtemp = carryBit;
				if (sumtemp<hexIntArray.get(i)) {
					sumIntArray.add(sumtemp);
					carryBit = 0;
				}else {
					carryBit = sumtemp/hexIntArray.get(i);
					sumIntArray.add(sumtemp%hexIntArray.get(i));
					carryBit=0;
				}
			}else {
				sumIntArray.add(carryBit);
				carryBit=0;
			}
			i++;
		}
		//������ȫΪ0�����
		int n = sumIntArray.size();
		for(int ii=n-1;ii>0;ii--)
		{
			if (n>1) {
				if (sumIntArray.get(ii)==0) {
					sumIntArray.remove(ii);
				}else {
					break;
				}
			}
		}
		for(int ii=sumIntArray.size()-1;ii>-1;ii--)
		{
			System.out.print(sumIntArray.get(ii));
		}
	}
	public static List<Integer> char2int(char[] charArray) {
		// TODO Auto-generated constructor stub
		List<Integer> temp = new ArrayList<>();
		int index = 0;
		for(char i:charArray)
		{
			temp.add(Integer.parseInt(String.valueOf(i)));
		}
		Collections.reverse(temp);
		return temp;
	}
	public static List<Integer> hexchar2int(char[] charArray) {
		// TODO Auto-generated constructor stub
		List<Integer> temp = new ArrayList<>();
		int index = 0;
		for(char i:charArray)
		{
			if (Integer.parseInt(String.valueOf(i)) == 0) {
				temp.add(10);
			}else {
				temp.add(Integer.parseInt(String.valueOf(i)));
			}
		}
		Collections.reverse(temp);
		return temp;
	}

}
