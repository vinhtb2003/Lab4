package Bai5;

import java.util.Scanner;

public abstract class GiangVien {
	private String hoten;
	private String diachi;
	private String loaigv;
public GiangVien() {
	
}
public GiangVien(String hoten, String diachi, String loaigv) {
	this.hoten = hoten;
	this.diachi = diachi;
	this.loaigv = loaigv;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public String getLoaigv() {
	return loaigv;
}
public void setLoaigv(String loaigv) {
	this.loaigv = loaigv;
}
public void nhapthongtin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ho ten: ");
	hoten=sc.nextLine();
	System.out.println("Dia chi: ");
	diachi=sc.nextLine();
	System.out.println("Loai giang vien: ");
	loaigv=sc.nextLine();
}
public abstract void tinhluong();

public void inthongtin() {
	System.out.println("Ho ten: "+hoten);
	System.out.println("Dia chi: "+diachi);
	System.out.println("Loai giang vien: "+loaigv);
	
}

}
