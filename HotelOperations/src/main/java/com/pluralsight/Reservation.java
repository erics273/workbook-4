package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //derived getters
    public double getPrice(){

//        if(this.getRoomType().equalsIgnoreCase("king")){
//            return 139.00;
//        }
//
//        return 124.00;

        return this.getRoomType().equalsIgnoreCase("king") ? 139.00 : 124.00;
    }

    //handle the resevation total taking into account numberOfNights, rate, and weekend surcharge
    public double getReservationTotal(){
        double total = this.getNumberOfNights() * this.getPrice();
        if(this.isWeekend()){
            total = total + (total * .1);
        }
        return total;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
