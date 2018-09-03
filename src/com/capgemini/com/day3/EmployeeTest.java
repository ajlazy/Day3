package com.capgemini.com.day3;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee employee1;

	@BeforeEach
	void setUp() {
		employee1 = new Employee("Ab12", "Sam", 3000.0, 50000.0);
	}

	@Test
	void testDisplayEmployeeinformation() {
		assertEquals("id is Ab12 Name is Sam Net Salary is 71800.0", employee1.displayEmployeeInformation());
		// assertEquals(37345.34, account.deposit(2345.34));
	}

}
