package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	ArrayList<GiangVien> dsgv= new ArrayList<GiangVien>();
	int luachon;
	Scanner sc=new Scanner(System.in);
do {
	System.out.println("Moi ban lua chon =========>>>>>>>");
	System.out.println("1.Giang vien co huu");
	System.out.println("2.Giang vien thinh giang");
	System.out.println("3.In ra danh sach giang vien");
	System.out.println("0.Thoat");
	luachon=sc.nextInt();
	switch(luachon) {
	case 1:{
		System.out.println("Nhap thong tin giang vien co huu");
		GVCoHuu ch=new GVCoHuu();
		ch.nhapGVCH();
		dsgv.add(ch);
		break;
	}
	case 2:{
		System.out.println("Nhap thong tin giang vien thinh giang");
		GVThinhGiang tg= new GVThinhGiang();
		tg.nhapGVTG();
		dsgv.add(tg);
		break;
	}
	case 3:{
		if(dsgv.size()==0) {
			System.out.println("Danh sach giang vien rong");
			
		}
		else {
			System.out.println("=============================");
			for(GiangVien gv: dsgv) {
				gv.inthongtin();
				gv.tinhluong();
			System.out.println("==============================");
			}
		}
		break;
	}
	default:
		System.out.println("Du lieu ban nhap khong hop le!!!");
	}
}while(luachon!=0);
}
}
