package com.tnb.tnbServers.data.entity;

public class SalesData {
	private String area;
	private Integer volume;
	private String monthYear;
	
	public SalesData(String area, Integer volume, String monthYear) {
		this.area = area;
		this.volume = volume;
		this.monthYear = monthYear;
	}
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public String getMonthYear() {
		return monthYear;
	}
	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

}
