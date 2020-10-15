package com.workshop2.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {
	public ArrayList<Hotel> arrayList;

	public HotelReservationSystem() {
		arrayList = new ArrayList<>();
	}

	public ArrayList<Hotel> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Hotel> arrayList) {
		this.arrayList = arrayList;
	}

	public void add(Hotel hotel) {
		arrayList.add(hotel);
	}

	public Integer size() {
		return arrayList.size();
	}

}
