package Bai4;

import java.util.Scanner;

public class HocVienLT extends HocVien {
	private int sobuoi;
	private double dongiaLT;

	public HocVienLT() {

	}

	public HocVienLT(String hoten, String diachi, String loaichuongtrinh, int loaiuutien, double hocphi, int sobuoi,
			double dongiaLT) {
		super(hoten, diachi, loaichuongtrinh, loaiuutien, hocphi);
		this.sobuoi = sobuoi;
		this.dongiaLT = dongiaLT;
	}

	public int getSobuoi() {
		return sobuoi;
	}

	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}

	public double getDongiaLT() {
		return dongiaLT;
	}

	public void setDongiaLT(double dongiaLT) {
		this.dongiaLT = dongiaLT;
	}

	public void nhapHVLT() {
		super.nhapHV();
		Scanner sc = new Scanner(System.in);
		System.out.println("So buoi lap trinh: ");
		sobuoi = sc.nextInt();
		System.out.println("Don gia lap trinh: ");
		dongiaLT = sc.nextDouble();
	}

	public void hocphi() {
		if (getLoaiuutien() == 1) {
			sethocphi(sobuoi * dongiaLT - 1000000);
		} else if (getLoaiuutien() == 2) {
			sethocphi(sobuoi * dongiaLT - 800000);
		} else {
			sethocphi(sobuoi * dongiaLT);
		}
		System.out.println("Hoc phi lap trinh la: " + gethocphi());
	}
}
