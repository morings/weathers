package com.example.collweather.model;

public class County {

	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	public County() {
		// TODO Auto-generated constructor stub
	
	}
public void setId(int id){
	this.id=id;
}
public int getId(){
	return id;
}
public void setcountyName(String countyName){
	this.countyName=countyName;
}
public String getcountyName(){
	return  countyName;
}
public void setcountyCode(String countyCode){
	this.countyCode=countyCode;
}
public String getcountyCode(){
	return countyCode;
}
public void setcityId(int cityId){
	this.cityId=cityId;
}
public int getcityId(){
	return cityId;
}
}


