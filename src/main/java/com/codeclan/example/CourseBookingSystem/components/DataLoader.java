package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repository.BookingRepository;

import com.codeclan.example.CourseBookingSystem.repository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    
    @Autowired
    BookingRepository bookingRepository;
    
    @Autowired
    CourseRepository courseRepository;
    
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Jack", "Tadcaster", 25);
        customerRepository.save(customer1);

        Course course1 = new Course("Programming for Beginners", "Edinburgh", 4);
        courseRepository.save(course1);

        Booking booking1 = new Booking("12/10/25", customer1, course1);
        bookingRepository.save(booking1);

        Customer customer2 = new Customer("John", "Dundee", 22);
        customerRepository.save(customer2);

        Course course2 = new Course("Programming in Python", "Glasgow", 5);
        courseRepository.save(course1);

        Booking booking2 = new Booking("25/10/25", customer2, course2);
        bookingRepository.save(booking2);

        Customer customer3 = new Customer("Peter", "Aberdeen", 35);
        customerRepository.save(customer3);

        Course course3 = new Course("Aggressive CV Reviews", "Edinburgh", 1);
        courseRepository.save(course3);

        Booking booking3 = new Booking("12/12/22", customer3, course3);
        bookingRepository.save(booking3);
        
        Customer customer4 = new Customer("Paul", "Belfast", 28);
        customerRepository.save(customer4);

        Course course4 = new Course("Alcoholics Anonymous", "Leeds", 2);
        courseRepository.save(course4);

        Booking booking4 = new Booking("12/2/27", customer4, course4);
        bookingRepository.save(booking4);

        Customer customer5 = new Customer("Harrison", "Glasgow", 10);
        customerRepository.save(customer5);

        Course course5 = new Course("Kung-Fu for Beginners", "London", 5);
        courseRepository.save(course5);

        Booking booking5 = new Booking("01/12/25", customer5, course5);
        bookingRepository.save(booking5);
        



    }
}