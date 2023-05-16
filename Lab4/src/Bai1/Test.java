package Bai1;

public class Test {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("Phuong Dong","phuong Duc Thang" , "Nguyen Van A");
		BenhNhan bn = new BenhNhan("Anh", 12,"Nam", "Binh thuong","Binh thuong", bv);
		System.out.println(bn);
	}
}
