package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchInAndPunchOut_should_generateTheCorrectHours() {

        //arrange
        Employee emp = new Employee(1, "Sam", "IT", 20.0, 0.0);

        //act
        emp.punchIn(8);
        emp.punchOut(17);

        //assert
        assertEquals(9.0, emp.getHoursWorked());
    }

}