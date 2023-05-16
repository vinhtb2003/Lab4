package Bai1;

import java.util.Scanner;

public class BenhVien {
private String ten;
private String Diachi;
private String Giamdoc;
public BenhVien() {
		
}

public BenhVien(String ten, String diachi, String giamdoc) {
     super();
	this.ten = ten;
	this.Diachi = diachi;
	this.Giamdoc = giamdoc;
}

public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getDiachi() {
	return Diachi;
}
public void setDiachi(String diachi) {
	this.Diachi = diachi;
}
public String getGiamdoc() {
	return Giamdoc;
}
public void setGiamdoc(String giamdoc) {
	this.Giamdoc = giamdoc;
}

@Override
public String toString() {
	return "tenVien: " + ten + "\n Diachi: " + Diachi + "\n Giamdoc: " + Giamdoc ;
}







}


