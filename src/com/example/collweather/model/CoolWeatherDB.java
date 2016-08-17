package com.example.collweather.model;

import java.util.ArrayList;
import java.util.List;

import com.example.collweather.db.CoolWeatherOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {
public static final String DB_NAME="cool_weather";
public static final int VERSION=1;
private static CoolWeatherDB coolWeatherDB;
private SQLiteDatabase db;
	public CoolWeatherDB(Context context) {
		// TODO Auto-generated constructor stub
		CoolWeatherOpenHelper dbHelper=new CoolWeatherOpenHelper(context,DB_NAME,null,VERSION);
		db=dbHelper.getWritableDatabase();
	}
public synchronized static CoolWeatherDB getInstance(Context context){
	if(coolWeatherDB==null){
		coolWeatherDB=new CoolWeatherDB(context);
		
	}
	return coolWeatherDB;
}
public void saveProvince(Province province){
	if(province!=null){
		ContentValues value=new ContentValues();
		value.put("province_name", province.getprovinceName());
		value.put("province_code",province.getprovinceCode());
		db.insert("Province", null, value);
	}
}
public List<Province> loadProvinces(){
 List<Province> list =new ArrayList<Province>();
 Cursor cursor=db.query("Province", null, null, null, null,null, null);
 if(cursor.moveToFirst()){
	 do{
		 Province province=new Province();
		 province.setId(cursor.getInt(cursor.getColumnIndex("id")));
		 province.setprovinceName(cursor.getString(cursor.getColumnIndex("provinceName")));
		 province.setprovinceCode(cursor.getString(cursor.getColumnIndex("provinceCode")));
	 } while (cursor.moveToNext());}
 if(cursor!=null){
	 cursor.close();
 }
 return list;
  }
public void saveCity(City city){
	if(city!=null){
		ContentValues value=new ContentValues();
		value.put("city_name",  city.getcityName());
		value.put("city_code",city.getcityCode());
		value.put("province_id", city.getprovinceId());
		db.insert("City", null, value);
	}
}
public List<City> loadCity(){
 List<City> list =new ArrayList<City>();
 Cursor cursor=db.query(" City", null, null, null, null,null, null);
 if(cursor.moveToFirst()){
	 do{
		 City  city=new  City();
		 city.setId(cursor.getInt(cursor.getColumnIndex("id")));
		 city.setcityName(cursor.getString(cursor.getColumnIndex("cityName")));
		 city.setcityCode(cursor.getString(cursor.getColumnIndex("cityCode")));
	 } while (cursor.moveToNext());}
 if(cursor!=null){
	 cursor.close();
 }
 return list;
  }
public void saveCounty(County county){
	if(county!=null){
		ContentValues value=new ContentValues();
		value.put("county_name",  county.getcountyName());
		value.put("county_code",county.getcountyCode());
		value.put("city_id", county.getcityId());
		db.insert("County", null, value);
	}
}
public List<County> loadCounty(){
 List<County> list =new ArrayList<County>();
 Cursor cursor=db.query(" County", null, null, null, null,null, null);
 if(cursor.moveToFirst()){
	 do{
		 County  county=new  County();
		 county.setId(cursor.getInt(cursor.getColumnIndex("id")));
		 county.setcountyName(cursor.getString(cursor.getColumnIndex("countyName")));
		 county.setcountyCode(cursor.getString(cursor.getColumnIndex("countyCode")));
	 } while (cursor.moveToNext());}
 if(cursor!=null){
	 cursor.close();
 }
 return list;
  }
}

