package cn.pintia;
/**
 * 1088
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PAT_1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");
		int you = Integer.parseInt(strings[0]);
		int X = Integer.parseInt(strings[1]);
		int Y = Integer.parseInt(strings[2]);
		XYZ xyz = new XYZ(0,0,0);
		for(int i = 10;i<100;i++){
			int y = getResolveI(i);
			double z = Math.abs(i - y) / X;
			
			if ((z*Y) == y) {
				xyz.set(i,y,z);
			}
		}
		if (xyz.getX() == 0) {
			System.out.println("No Solution");
		}else {
			System.out.println(xyz.getX()+" "+getReturnStr(you, xyz.getX())+" "+getReturnStr(you, xyz.getY())+" "+getReturnStr(you, xyz.getZ()));
		}
	}
	public static int getResolveI(int i){
		StringBuilder sbBuilder = new StringBuilder();
		while (i>9) {
			sbBuilder.append(Integer.toString(i%10));
			i /= 10;
		}
		sbBuilder.append(Integer.toString(i));
		
		return Integer.parseInt(sbBuilder.toString());
	}
	public static String getReturnStr(int you,int n){
		String string = "Ping";
		if (you < n) {
			string = "Cong";
		}else if (you > n) {
			string = "Gai";
		}
		return string;
	}
	public static String getReturnStr(int you,double n){
		String string = "Ping";
		if (you < n) {
			string = "Cong";
		}else if (you > n) {
			string = "Gai";
		}
		return string;
	}

}
class XYZ{
	int X,Y;
	double Z;
	public XYZ(int X,int Y,double Z){
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	public void set(int X,int Y,double Z){
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public double getZ() {
		return Z;
	}
}
