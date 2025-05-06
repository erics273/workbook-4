package com.pluralsight;

public class Room {

    //create the instance variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //constructor to instantiate a room
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //create derived methods

    //method to check if the room is available
    //based on if it is clean and occupied
    public boolean isAvailable(){

//        if(!this.isOccupied() && !this.isDirty()){
//            return true;
//        }
//
//        return false;

        return !this.isDirty() && !this.isOccupied();
    }

    public void checkIn() {
        //some error checking to see if the room is even available
        if (this.isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;  // Mark room dirty once occupied
            System.out.println("Guest checked in.");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void checkOut() {
        //clean the dang room
        this.cleanRoom();
        //get out the dang room
        this.isOccupied = false;

    }

    public void cleanRoom() {
            this.isDirty = false;
    }

    //create getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }


}
