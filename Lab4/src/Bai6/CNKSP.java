package Bai6;

import java.util.Scanner;

public class CNKSP extends Congnhan {
private double soSP,dongiaSP,thuong,mucquydinhsp;
private long luongthang;
public CNKSP() {
	
}
	
	public CNKSP(double soSP, double dongiaSP, double thuong, long luongthang, double mucquydinhsp) {
	super();
	this.soSP = soSP;
	this.dongiaSP = dongiaSP;
	this.thuong = thuong;
	this.luongthang = luongthang;
	this.mucquydinhsp = mucquydinhsp;
}
	public void nhapCNKSP() {
		super.nhapthongtin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Muc quy dinh sp trong thang: ");
		mucquydinhsp=sc.nextDouble();
		System.out.println("So san pham: ");
		soSP=sc.nextDouble();
		System.out.println("Don gia san pham: ");
		dongiaSP=sc.nextDouble();
	}
	public void inCNKSP() {
		super.inthongtin();
		System.out.println("Muc quy dinh san pham trong thang: "+mucquydinhsp);
		System.out.println("So san pham: "+soSP);
		System.out.println("Don gia san pham: "+dongiaSP);
		System.out.println("Thuong: "+thuong);
	}

	@Override
	public void tinhluong() {
		if(soSP<=1000) {
			thuong=0;
		}else if(soSP>=1100&&soSP<1150){
			thuong=1000000;
		}else{
			thuong=1500000;
		}
		luongthang=(long) (soSP*dongiaSP+thuong);
		System.out.println("Thuong= "+thuong);
		System.out.println("Luong thang= "+luongthang);
		
	}

}
