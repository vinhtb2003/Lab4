package Bai6;

import java.util.Scanner;

public abstract class Congnhan {
	private String hoten,diachi,ngaysinh,loaicongnhan;
    private double tinhluong;

public Congnhan() {
	
}


public Congnhan(String hoten, String diachi, String ngaysinh, String loaicongnhan) {
	this.hoten = hoten;
	this.diachi = diachi;
	this.ngaysinh = ngaysinh;
	this.loaicongnhan = loaicongnhan;
}
public void nhapthongtin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ho ten: ");
	hoten=sc.nextLine();
	System.out.println("Dia chi: ");
	diachi=sc.nextLine();
	System.out.println("Ngay sinh: ");
	ngaysinh=sc.nextLine();
	System.out.println("Loai cong nhan: ");
	loaicongnhan=sc.nextLine();
}
public abstract void tinhluong();
public void inthongtin() {
	System.out.println("Ho ten: "+hoten);
	System.out.println("Dia chi: "+diachi);
	System.out.println("Ngay sinh: "+ngaysinh);
	System.out.println("Loai cong nhan: "+loaicongnhan);
	
	
}
}