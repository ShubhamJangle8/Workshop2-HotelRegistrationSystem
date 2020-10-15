package com.workshop2.hotelreservationsystem;

public class HotelReservationMain {
	public static void main(String[] args) {
		Hotel hotel1 = new Hotel("LakeWood", 110, 90);
		Hotel hotel2 = new Hotel("BridgeWood", 160, 60);
		Hotel hotel3 = new Hotel("BridgeWood", 220, 150);
		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		hotelSystem.add(hotel1);
		hotelSystem.add(hotel2);
		hotelSystem.add(hotel3);
		hotelSystem.getArrayList().forEach(h -> System.out.println(h));
	}
}
