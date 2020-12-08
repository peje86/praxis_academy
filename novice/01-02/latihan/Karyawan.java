// package com.nursalim.zone.java.serialization;

import java.io.Serializable;
import java.util.Date;

//public class Karyawan implements Serializable {
    public class Karyawan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5800843163467281306L;
	private String nama;
	private String gender;
	private String tempatLahir;
	private Date tanggalLahir;
	
	public Karyawan(String nama, String gender, String tempatLahir, Date tanggalLahir){
		this.nama = nama;
		this.gender = gender;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTempatLahir() {
		return tempatLahir;
	}
	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Karyawan");
		sb.append("{");
		sb.append("nama=").append(nama);
		sb.append(",gender=").append(gender);
		sb.append(",tempatLahir=").append(tempatLahir);
		sb.append(",tanggalLahir=").append(tanggalLahir);
		sb.append("}");
		return "";
	}
	
}
