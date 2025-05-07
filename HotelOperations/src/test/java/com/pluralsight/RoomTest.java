package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_makeRoomOccupied() {
        //arrange
        Room room = new Room(2, 100.0, false, false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkIn_should_makeRoomDirty() {
        //arrange
        Room room = new Room(2, 100.0, false, false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_should_failIfOccupied() {
        //arrange
        Room room = new Room(2, 100.0, true, false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());  // should remain unchanged
    }

    @Test
    public void checkIn_should_failIfDirty() {
        //arrange
        Room room = new Room(2, 100.0, false, true);

        //act
        room.checkIn();

        //assert
        assertFalse(room.isOccupied());  // check-in should fail
    }

    @Test
    public void checkOut_should_makeRoomAvailable() {
        //arrange
        Room room = new Room(2, 100.0, true, true);

        //act
        room.checkOut();

        //assert
        assertTrue(room.isAvailable());
    }

    @Test
    public void checkOut_should_cleanRoom() {
        //arrange
        Room room = new Room(2, 100.0, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_should_makeRoomDirty() {
        //arrange
        Room room = new Room(2, 100.0, false, true);

        //act
        room.cleanRoom();

        //assert
        assertFalse(room.isDirty());
    }

}