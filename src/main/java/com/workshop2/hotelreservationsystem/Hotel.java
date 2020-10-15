package com.workshop2.hotelreservationsystem;

public class Hotel {
	String hotelName;
	int normalWeekDay, normalWeekEnd;

	public Hotel(String hotelName, int regularWeekDay, int regularWeekEnd) {
		super();
		this.hotelName = hotelName;
		this.normalWeekDay = regularWeekDay;
		this.normalWeekEnd = regularWeekEnd;
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

	public int getNormalWeekEnd() {
		return normalWeekEnd;
	}

	public void setNormalWeekEnd(int normalWeekEnd) {
		this.normalWeekEnd = normalWeekEnd;
	}

	public String toString() {
		return "Hotel Name : " + hotelName + ", Normal Week day Rate : " + normalWeekDay + ", Normal Week End Rate :"
				+ normalWeekEnd;
	}
}
