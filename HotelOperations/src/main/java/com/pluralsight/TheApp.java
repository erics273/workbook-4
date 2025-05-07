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
        reservation1.setNumberOfNights(3);

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

        //-----------------------------------------Employee Class below

        Employee employee3 = new Employee(102, "Taylor Smith", "HR", 20.0, 0);

        // Simulate punching in and out
        employee3.punchIn(9.0);    // 9:00 AM
        employee3.punchOut(13.5);  // 1:30 PM

        System.out.println("Hours Worked: " + employee3.getHoursWorked());

        employee1.punchTimeCard(9.0, true);    // 9:00 AM
        employee3.punchTimeCard(13.5, false);  // 1:30 PM
        System.out.println("Hours Worked: " + employee3.getHoursWorked());


        //-----------------------------------------Hotel Class below

        // Create a hotel with 10 suites and 50 basic rooms
        Hotel hotel = new Hotel("Grand Plaza", 10, 50);

        // Print initial availability
        System.out.println("Initial available suites: " + hotel.getAvailableSuites());
        System.out.println("Initial available rooms: " + hotel.getAvailableRooms());

        // Try to book 3 suites
        boolean suitesBooked = hotel.bookRoom(3, true);
        System.out.println("Booking 3 suites: " + (suitesBooked ? "Success" : "Failed"));

        // Try to book 10 basic rooms
        boolean roomsBooked = hotel.bookRoom(10, false);
        System.out.println("Booking 10 basic rooms: " + (roomsBooked ? "Success" : "Failed"));

        // Print availability after booking
        System.out.println("Available suites after booking: " + hotel.getAvailableSuites());
        System.out.println("Available rooms after booking: " + hotel.getAvailableRooms());

        // Try to overbook 8 more suites (only 7 left)
        boolean overbookSuites = hotel.bookRoom(8, true);
        System.out.println("Booking 8 more suites: " + (overbookSuites ? "Success" : "Failed"));

        // Try to overbook 45 more basic rooms (only 40 left)
        boolean overbookRooms = hotel.bookRoom(45, false);
        System.out.println("Booking 45 more basic rooms: " + (overbookRooms ? "Success" : "Failed"));

        // Final availability check
        System.out.println("Final available suites: " + hotel.getAvailableSuites());
        System.out.println("Final available rooms: " + hotel.getAvailableRooms());
    }

}
