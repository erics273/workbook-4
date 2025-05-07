package com.pluralsight;

public class Hotel {

    //create the private varaibles/attributes for the hotel
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //constructor that omits booked rooms and defaults them to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        //default booked rooms to 0
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //constructor that works with all properties
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //derived methods to get available rooms/suites and book the rooms/suites
    public int getAvailableSuites(){
        return this.getNumberOfSuites() - this.getBookedSuites();
    }

    public int getAvailableRooms(){
        return this.getNumberOfRooms() - this.getBookedBasicRooms();
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){

        //check if they want a suite
        if (isSuite) {
            //if they do want a sweet make sure we have enough rooms
            if (numberOfRooms <= getAvailableSuites()) {
                this.bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            //otherwise they wanta basic room and we need to make sure there are enough of those
            if (numberOfRooms <= getAvailableRooms()) {
                this.bookedBasicRooms += numberOfRooms;
                return true;
            }
        }

        //if rooms are not available then return false
        return false;

    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }



}
