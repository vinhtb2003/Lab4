package Bai5;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double hesoluong,phucap,luongcoban,ThamNien,luongthang;
	
	public GVCoHuu() {
		
	}
	
	public GVCoHuu(String hoten, String diachi, String loaigv, double hesoluong, double phucap, double luongcoban,double ThamNien,double luongthang) {
		super(hoten, diachi, loaigv);
		this.hesoluong = hesoluong;
		this.phucap = phucap;
		this.luongcoban = luongcoban;
	    this.ThamNien=ThamNien;
	    this.luongthang=luongthang;
	}

	

public void nhapGVCH() {
	super.nhapthongtin();
	Scanner sc=new Scanner(System.in);
	System.out.println("Luong co ban: ");
	luongcoban=sc.nextDouble();
	System.out.println("Phu cap: ");
	phucap=sc.nextDouble();
	System.out.println("He so luong: ");
	hesoluong=sc.nextDouble();
    System.out.println("Tham nien: ");
    ThamNien=sc.nextDouble();
}

	@Override
	public void tinhluong() {
		if(ThamNien<5) {
			phucap=0;
		}	else  {
				phucap=(ThamNien*luongcoban)/100;
			}
		luongthang=luongcoban*hesoluong+phucap;
		System.out.println("Luong thang: "+luongthang);
		}
    
	}


