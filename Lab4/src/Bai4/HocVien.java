package Bai4;

import java.util.Scanner;

public abstract class HocVien {
	private String hoten;
	private String diachi;
	private String loaichuongtrinh;
	private int loaiuutien;
	private double hocphi;

	public HocVien() {

	}

	public HocVien(String hoten, String diachi, String loaichuongtrinh, int loaiuutien, double hocphi) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.loaichuongtrinh = loaichuongtrinh;
		this.loaiuutien = loaiuutien;
		this.hocphi = hocphi;
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

	public String getLoaichuongtrinh() {
		return loaichuongtrinh;
	}

	public void setLoaichuongtrinh(String loaichuongtrinh) {
		this.loaichuongtrinh = loaichuongtrinh;
	}

	public int getLoaiuutien() {
		return loaiuutien;
	}

	public void setLoaiuutien(int loaiuutien) {
		this.loaiuutien = loaiuutien;
	}

	public double gethocphi() {
		return hocphi;
	}

	public void sethocphi(double hocphi) {
		this.hocphi = hocphi;
	}

	public void nhapHV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Dia chi: ");
		diachi = sc.nextLine();
		System.out.println("Loai chuong trinh: ");
		loaichuongtrinh = sc.nextLine();
		System.out.println("Loai uu tien: ");
		loaiuutien = sc.nextInt();
	}

	public abstract void hocphi();

	public void inHocVien() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Dia chi: " + diachi);
		System.out.println("Loai chuong trinh: " + loaichuongtrinh);
		System.out.println("Loai uu tien: " + loaiuutien);
		System.out.println("Hoc phi: "+hocphi);
	}
}
