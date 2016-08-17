package com.example.collweather.model;

public class City {

	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	public City() {
		// TODO Auto-generated constructor stub
	
	}
public void setId(int id){
	this.id=id;
}
public int getId(){
	return id;
}
public void setcityName(String cityName){
	this.cityName=cityName;
}
public String getcityName(){
	return  cityName;
}
public void setcityCode(String cityCode){
	this.cityCode=cityCode;
}
public String getcityCode(){
	return cityCode;
}
public void setprovinceId(int provinceId){
	this.provinceId=provinceId;
}
public int getprovinceId(){
	return provinceId;
}
}


