package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<HocVien> dshv = new ArrayList<HocVien>();
		

		int luachon;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Nhap hoc vien do hoa");
			System.out.println("2.Nhap hoc vien lap trinh");
			System.out.println("3.In ra danh sach");
			System.out.println("0.Thoat");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: {
				System.out.println("Moi nhap thong tin hoc vien do hoa");
				HocVienDH dh = new HocVienDH();
				dh.nhapHVDH();
				dh.toString();
				dh.hocphi();
				dshv.add(dh);
				break;
			}
			case 2: {
				System.out.println("Moi nhap thong tin hoc vien lap trinh");

				HocVienLT lt = new HocVienLT();
				lt.nhapHVLT();
				lt.toString();
				lt.hocphi();
				dshv.add(lt);
				break;
			}
			case 3: {
				if (dshv.size() == 0) {
					System.out.println("Danh sach hoc vien rong!");
				} else {
					System.out.println("===================");
					for (HocVien hocvien : dshv) {
						hocvien.inHocVien();
					System.out.println("===================");
					}
				}
				break;
			}

			default:
				System.out.println("Ban da nhap sai du lieu");
				break;
			}
		} while (luachon != 0);
	}
}
