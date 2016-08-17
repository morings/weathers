package com.example.collweather.model;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	public Province() {
		// TODO Auto-generated constructor stub
	
	}
public void setId(int id){
	this.id=id;
}
public int getId(){
	return id;
}
public void setprovinceName(String provinceName){
	this.provinceName=provinceName;
}
public String getprovinceName(){
	return  provinceName;
}
public void setprovinceCode(String provinceCode){
	this.provinceCode=provinceCode;
}
public String getprovinceCode(){
	return provinceCode;
}
}
