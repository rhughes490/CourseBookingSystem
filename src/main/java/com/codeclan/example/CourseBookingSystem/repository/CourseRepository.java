package com.codeclan.example.CourseBookingSystem.repository;

import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByStarRating(int starRating);
    List<Course> findByBookingsCustomer (Customer customer);
}
