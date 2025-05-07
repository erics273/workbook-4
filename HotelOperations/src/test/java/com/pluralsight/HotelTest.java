package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookRoom_should_increaseBookedSuites(){
        //arrange
        Hotel theHotel = new Hotel("Eric's Amazing Hotel", 10, 50);


        //act
        theHotel.bookRoom(3, true);


        //assert
        assertEquals(7, theHotel.getAvailableSuites());
    }

    @Test
    public void bookRoom_should_increaseBookedRooms(){
        //arrange
        Hotel theHotel = new Hotel("Eric's Amazing Hotel", 10, 50);


        //act
        theHotel.bookRoom(3, false);


        //assert
        assertEquals(47, theHotel.getAvailableRooms());
    }

    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable(){
        //arrange
        Hotel theHotel = new Hotel("Eric's Amazing Hotel", 10, 50);

        //act
        boolean success = theHotel.bookRoom(11, true);

        //assert
        assertFalse(success);

    }

    @Test
    public void bookRoom_should_returnTrueIfSuitesAvailable(){
        //arrange
        Hotel theHotel = new Hotel("Eric's Amazing Hotel", 10, 50);

        //act
        boolean success = theHotel.bookRoom(9, true);

        //assert
        assertTrue(success);

    }

    @Test
    public void getName_should_returnTheHotelsName(){

        //arrange
        Hotel theHotel = new Hotel("Eric's Amazing Hotel", 10, 50);


        //act
        String hotelName = theHotel.getName();

        //assert
        assertEquals("Eric's Amazing Hotel", hotelName);
    }

}