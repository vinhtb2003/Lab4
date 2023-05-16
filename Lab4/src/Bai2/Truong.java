package Bai2;

public class Truong {
private String ten;
private String Diachi;
private String Hieutruong;
public Truong() {
	
}
public Truong(String ten, String Diachi, String Hieutruong) {
	
	this.ten = ten;
	this.Diachi = Diachi;
	this.Hieutruong = Hieutruong;
}
@Override
public String toString() {
	return "ten: " + ten + "\n Diachi: " + Diachi + "\n Hieutruong: " + Hieutruong ;
}

}
