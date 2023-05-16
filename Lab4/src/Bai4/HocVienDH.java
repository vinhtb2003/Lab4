package Bai4;

import java.util.Scanner;

public class HocVienDH extends HocVien {
	private int sobuoi;
	private double dongiaDH;

	public HocVienDH() {

	}

	public HocVienDH(String hoten, String diachi, String loaichuongtrinh, int loaiuutien, int sobuoi, float dongiaDH,
			double hocphi) {
		super(hoten, diachi, loaichuongtrinh, loaiuutien, hocphi);
		this.sobuoi = sobuoi;
		this.dongiaDH = dongiaDH;
	}

	public int getSobuoi() {
		return sobuoi;
	}

	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}

	public double getDongiaDH() {
		return dongiaDH;
	}

	public void setDongiaDH(double dongiaDH) {
		this.dongiaDH = dongiaDH;
	}

	HocVien hv = new HocVien() {

		@Override
		public void hocphi() {

		}
	};

	public void nhapHVDH() {
		super.nhapHV();
		Scanner sc = new Scanner(System.in);
		System.out.println("So buoi do hoa: ");
		sobuoi = sc.nextInt();
		System.out.println("Don gia do hoa: ");
		dongiaDH = sc.nextDouble();

	}

	public void hocphi() {
		if (getLoaiuutien() == 1) {
			sethocphi(sobuoi * dongiaDH - 1000000);
		} else if (getLoaiuutien() == 2) {
			sethocphi(sobuoi * dongiaDH - 500000);
		} else {
			sethocphi(sobuoi * dongiaDH);
		}
		System.out.println("Hoc phi do hoa la: " + gethocphi());
	}
}
