package com.capgemini.com.day3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TelevisionTest {

	Television operation;
		
	@BeforeEach
		void setUp()
		{
			operation = new Television();
			operation.setPower(true);
			operation.setChannel(117);
			operation.setVolume(4);
		}
		
		@Test
		void testOperations() 
		{
		assertEquals(143,operation.changeChannel(143));
		assertEquals(8,operation.changeVolume(8));
		assertEquals("Power: true | Channel: 143 | Volume: 8",operation.televisionStatus());
		assertEquals(201,operation.changeChannel(201));
		assertEquals(6,operation.changeVolume(6));
		assertEquals("Power: true | Channel: 201 | Volume: 6",operation.televisionStatus());
		assertEquals(false,operation.powerStatus());
		assertEquals(0,operation.changeChannel(143));
		assertEquals(0,operation.changeVolume(8));
		assertEquals("Power: false",operation.televisionStatus());
	}


}



