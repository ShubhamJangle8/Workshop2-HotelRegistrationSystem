package com.workshop2.hotelreservationsystem;

public class Hotel {
	String hotelName;
	int normalWeekDay;

	public Hotel(String hotelName, int regularWeekDay) {
		super();
		this.hotelName = hotelName;
		this.normalWeekDay = regularWeekDay;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNormalWeekDay() {
		return normalWeekDay;
	}

	public void setNormalWeekDay(int normalWeekDay) {
		this.normalWeekDay = normalWeekDay;
	}

	public String toString() {
		return "Hotel Name : " + hotelName + ", Normal Week day Rate : " + normalWeekDay;
	}
}
