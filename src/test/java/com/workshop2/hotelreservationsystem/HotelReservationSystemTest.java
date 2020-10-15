package com.workshop2.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void GivenHotels_AddedToTheHotelReservationSystem() {
		System.out.println("Welcome to the Hotel Registration system");
		Hotel hotel1 = new Hotel("LakeWood", 110);
		Hotel hotel2 = new Hotel("BridgeWood", 160);
		Hotel hotel3 = new Hotel("BridgeWood", 220);
		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		hotelSystem.add(hotel1);
		hotelSystem.add(hotel2);
		hotelSystem.add(hotel3);
		Integer size = 3;
		hotelSystem.getArrayList().forEach(h -> System.out.println(h));
		Assert.assertEquals(size, hotelSystem.size());
	}
}
