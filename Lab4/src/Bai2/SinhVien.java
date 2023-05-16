package Bai2;

public class SinhVien extends Nguoi {
private String lop;
private String nganh;
private Truong truong;
public SinhVien() {
	
}
public SinhVien(String lop,String nganh,String ten,int tuoi,String gioiTinh,Truong truong) {
	super(ten,tuoi,gioiTinh);
	this.lop=lop;
	this.nganh=nganh;
    this.truong=truong;
}
@Override
public String toString() {
	return  super.toString()+ "\n Lop: " + lop + "\n Nganh: " + nganh + "\n Truong: " + truong ;
}



}

