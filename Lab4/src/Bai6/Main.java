package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	ArrayList<Congnhan> dscn = new ArrayList<Congnhan>();
	int Luachon;
	Scanner sc =new Scanner(System.in);
	
	do {
		System.out.println("========MENU LUA CHON============");
		System.out.println("1.Cong nhan khoan san pham");
		System.out.println("2.Cong nhan tinh cong nhat");
		System.out.println("3.In danh sach cong nhan");
		System.out.println("4.Thoat!!!");
		Luachon=sc.nextInt();
	switch(Luachon) {
	case 1:{
		System.out.println("Moi nhap cong nhan khoan san pham");
		CNKSP ksp=new CNKSP();
		ksp.nhapCNKSP();
		dscn.add(ksp);
		break;
	}
	case 2:{
		System.out.println("Moi nhap cong nhan tinh cong nhat");
		CNTCN tcn=new CNTCN();
		tcn.nhapCNTCN();
		dscn.add(tcn);
		break;
	}
	case 3:{
	 if(dscn.size()==0) {
		 System.out.println("Danh sach rong");
		 	 }
	 else {
		 System.out.println("==============================");
		 for(Congnhan cn: dscn) {
			 cn.inthongtin();
			 cn.tinhluong();
			 System.out.println("==============================");
			 
		 }
		 
	 }
	 break;
	}
	default:
		System.out.println("Ban nhap sai du lieu");
	}
		
	}while(Luachon!=0);
}
}
