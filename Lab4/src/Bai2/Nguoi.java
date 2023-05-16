package Bai2;

public class Nguoi {
private String ten;
private int tuoi;
private String gioiTinh;
public Nguoi() {
	
}
public Nguoi(String ten, int tuoi, String gioiTinh) {
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioiTinh = gioiTinh;
}
public String setten() {
	return ten;
}
public void getten(String ten) {
	this.ten=ten;
}
public int settuoi() {
	return tuoi;
}
public void gettuoi(int tuoi) {
	this.tuoi=tuoi;
}
public String setgioiTinh() {
	return gioiTinh;
}
public void getgioiTinh(String gioiTinh) {
	this.gioiTinh=gioiTinh;
}
@Override
public String toString() {
	return  "Ten: " + ten + "\n Tuoi: " + tuoi + "\n Gioi tinh: " + gioiTinh ;
}

}
