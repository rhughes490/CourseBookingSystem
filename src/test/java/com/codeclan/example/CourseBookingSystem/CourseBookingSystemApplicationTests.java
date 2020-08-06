package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;


	@Test
	public void createCustomerAndBookingThenSave(){

		Customer customer1 = new Customer("Jack", "Tadcaster", 25);
		customerRepository.save(customer1);

		Course course1 = new Course("Programming for Beginners", "Edinburgh", 4);
		courseRepository.save(course1);

		Booking booking1 = new Booking("12/10/25", customer1, course1);
		bookingRepository.save(booking1);

		assertEquals("Jack", customer1.getName());
		Customer customer = booking1.getCustomer();
		assertEquals("Jack", customer.getName());

	}
}
