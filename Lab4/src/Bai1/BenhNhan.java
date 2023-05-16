package Bai1;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
private String tienSu;
private String chanDoan;
private BenhVien benhVien;


public BenhNhan() {
	
}
public BenhNhan(String ten, int tuoi, String gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
	super(ten, tuoi, gioiTinh);
	this.tienSu = tienSu;
	this.chanDoan = chanDoan;
	this.benhVien = benhVien;
}
public String getTienSu() {
	return tienSu;
}
public void setTienSu(String tienSu) {
	this.tienSu = tienSu;
}
public String getChanDoan() {
	return chanDoan;
}
public void setChanDoan(String chanDoan) {
	this.chanDoan = chanDoan;
}


public BenhVien getBenhVien() {
	return benhVien;
}
public void setBenhVien(BenhVien benhVien) {
	this.benhVien = benhVien;
}
@Override
public String toString() {
	return super.toString()+"\n tienSu: " + tienSu + "\n chanDoan: " + chanDoan +"\n " + benhVien;
}

}
