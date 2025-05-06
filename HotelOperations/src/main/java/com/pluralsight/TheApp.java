package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

        //-----------------------------------------Room Class below

        //test our room class
        Room room1 = new Room(2, 139.00, false, false);
        Room room2 = new Room(1, 100.00, true, true);

        //room one should be available because it is not dirty and is not occupied
        System.out.println("Is room1 available: " + room1.isAvailable());
        //room two should NOT be available because it is dirty and is occupied
        System.out.println("Is room2 available: " + room2.isAvailable());

        //-----------------------------------------Reservation Class below

        //testing the reservation class
        Reservation reservation1 = new Reservation("king", 1, false);
        Reservation reservation2 = new Reservation("double", 1, false);

        System.out.println("The nightly rate for reservation 1 is: " + reservation1.getPrice());
        System.out.println("The nightly rate for reservation 2 is: " + reservation2.getPrice());

        System.out.println("The total for reservation 1 is: " + reservation1.getReservationTotal());
        System.out.println("The total for reservation 2 is: " + reservation2.getReservationTotal());

        //change the number of nights for reservation 1
        System.out.println("number of nights changed to 2 for reservation 1");
        reservation1.setNumberOfNights(2);

        //output the new total
        System.out.println("The NEW total for reservation 1 is: " + reservation1.getReservationTotal());

        //change reservation 1 to span a weekend
        System.out.println("Reservation 1 is now over a weekend and should be 10% more");
        reservation1.setIsWeekend(true);

        //output the new total
        System.out.println("The NEW total for reservation 1 is: " + reservation1.getReservationTotal());

        //-----------------------------------------Employee Class below

        // Create an Employee object
        Employee employee1 = new Employee(1, "Alice Smith", "Sales", 20.0, 40.0);

        // Test and print derived getters
        System.out.println("Employee ID: " + employee1.getEmployeeId());

        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.println("Total Pay: $" + employee1.getTotalPay());

        // Create an Employee object
        Employee employee2 = new Employee(1, "Eric Schwartz", "Tech", 25.0, 45.0);

        // Test and print derived getters
        System.out.println("Employee ID: " + employee2.getEmployeeId());

        System.out.println("Regular Hours: " + employee2.getRegularHours());
        System.out.println("Overtime Hours: " + employee2.getOvertimeHours());
        System.out.println("Total Pay: $" + employee2.getTotalPay());

    }

}
