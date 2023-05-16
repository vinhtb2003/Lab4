package Bai5;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	private double luongthang,sotiet,dongia,PTthunhap;
	public GVThinhGiang() {
		
	}
	
	public GVThinhGiang(double luongthang, double sotiet, double dongia, double pTthunhap) {
		super();
		this.luongthang = luongthang;
		this.sotiet = sotiet;
		this.dongia = dongia;
		PTthunhap = pTthunhap;
	}

	public double getLuongthang() {
		return luongthang;
	}

	public void setLuongthang(double luongthang) {
		this.luongthang = luongthang;
	}

	public double getSotiet() {
		return sotiet;
	}

	public void setSotiet(double sotiet) {
		this.sotiet = sotiet;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public double getPTthunhap() {
		return PTthunhap;
	}

	public void setPTthunhap(double pTthunhap) {
		this.PTthunhap = pTthunhap;
	}
	public void nhapGVTG() {
		super.nhapthongtin();;
		Scanner sc=new Scanner(System.in);
		System.out.println("So tiet day: ");
		sotiet=sc.nextDouble();
		System.out.println("Don gia: ");
		dongia=sc.nextDouble();
		System.out.println("Phan tram thu nhap: ");
		PTthunhap=sc.nextDouble();
	}

	@Override
	public void tinhluong() {
		PTthunhap=15%(sotiet*dongia);
		luongthang=sotiet*dongia-PTthunhap;
		System.out.println("Luong thang: "+luongthang);
	}

}
