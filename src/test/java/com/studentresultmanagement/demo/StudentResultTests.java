package com.studentresultmanagement.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTests{

    StudentResult result = new StudentResult();

    @Test
    void testCalculateTotal() {
        assertEquals(240, result.calculateTotal(80, 85, 75));
    }

    @Test
    void testCalculateAverage() {
        assertEquals(80.0, result.calculateAverage(80, 85, 75));
    }

    @Test
    void testCalculateGrade() {
        assertEquals("A", result.calculateGrade(95));
        assertEquals("B", result.calculateGrade(80));
        assertEquals("C", result.calculateGrade(60));
        assertEquals("F", result.calculateGrade(40));
    }
}
