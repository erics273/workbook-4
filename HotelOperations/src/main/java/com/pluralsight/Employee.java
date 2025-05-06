package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    // Private instance variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters for basic fields
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Derived getters

    // Get regular hours (up to 40)
    public double getRegularHours() {
        if (this.getHoursWorked() > 40) {
            return 40;
        } else {
            return this.getHoursWorked();
        }
    }

    // Get overtime hours (hours over 40)
    public double getOvertimeHours() {
        if (this.getHoursWorked() > 40) {
            return this.getHoursWorked() - 40;
        } else {
            return 0;
        }
    }

    // Calculate total pay including overtime
    public double getTotalPay() {
        double regularPay = this.getRegularHours() * this.getPayRate();
        double overtimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;
        return regularPay + overtimePay;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        this.startTime = time;
    }


    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        if (time >= this.startTime) {
            double worked = time - this.startTime;
            this.hoursWorked += worked;
        } else {
            System.out.println("Error: Punch out time is earlier than punch in time.");
        }
    }

    public void punchIn(double time) {
        this.startTime = time;
    }

    public void punchOut(double time) {
        //make sure the time is not before the start time
        if (time >= startTime) {
            double worked = time - startTime;
            this.hoursWorked += worked;
        } else {
            System.out.println("Error: Punch out time is earlier than punch in time.");
        }
    }

    public void punchTimeCard(double time, boolean isPunchIn) {
        if(isPunchIn){
//            this.startTime = time;
            this.punchIn(time);
        }else{
//            if (time >= this.startTime) {
//                double worked = time - this.startTime;
//                this.hoursWorked += worked;
//            } else {
//                System.out.println("Error: Punch out time is earlier than punch in time.");
//            }
            this.punchOut(time);
        }

    }

}
