package Bai6;

import java.util.Scanner;

public class CNTCN extends Congnhan {
	private double LCB,hesoluong,thuong,luongthang,songaycong;
	public CNTCN() {
		
	}
	
	

	public CNTCN(double lCB, double hesoluong, double thuong, double luongthang, double songaycong) {
		super();
		LCB = lCB;
		this.hesoluong = hesoluong;
		this.thuong = thuong;
		this.luongthang = luongthang;
		this.songaycong = songaycong;
	}

public void nhapCNTCN(){
	super.nhapthongtin();
	Scanner sc=new Scanner(System.in);
	System.out.println("Luong co ban: ");
	LCB=sc.nextDouble();
	System.out.println("He so luong: ");
	hesoluong=sc.nextDouble();
	System.out.println("So ngay cong: ");
	songaycong=sc.nextDouble();
}
public void inCNTCN() {
	super.inthongtin();
	System.out.println("Luong co ban= "+LCB);
	System.out.println("He so luong= "+hesoluong);
	System.out.println("So ngay cong= "+songaycong);
	System.out.println("Thuong: "+thuong);
	
}

	@Override
	public void tinhluong() {
		if(songaycong<20) {
			thuong=0;
		}
		else {
			thuong=1.2*LCB;
		}
		luongthang=LCB*hesoluong+thuong;
		System.out.println("Thuong= "+thuong);
		System.out.println("Luong thang= "+luongthang);
	}

}
