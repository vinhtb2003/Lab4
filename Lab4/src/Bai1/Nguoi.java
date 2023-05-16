package Bai1;

import java.util.Scanner;

public class Nguoi {
private String ten;
private int tuoi;
private String gioiTinh;
 public Nguoi() {
	 
 }
 public Nguoi(String ten, int tuoi, String gioiTinh) {
	 this.ten=ten;
	 this.tuoi=tuoi;
	 this.gioiTinh=gioiTinh;
 }
 public String getten() {
	 return ten;
 }
 public void Setten(String ten) {
	 this.ten=ten;	 
 }
 public int gettuoi() {
	 return tuoi;
 }
 public void settuoi(int tuoi) {
	 this.tuoi=tuoi;
 }
 public String getgioiTinh() {
	 return gioiTinh;
 }
 public void setgioiTinh(String gioiTinh) {
	 this.gioiTinh=gioiTinh;
 }
 
@Override
public String toString() {
	return " ten: " + ten + "\n tuoi: " + tuoi + "\n gioiTinh: " + gioiTinh ;
	
}
 
}

