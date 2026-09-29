package com.studentresultmanagement.demo;

public class StudentResult {

    // Calculate total marks
    public int calculateTotal(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    // Calculate average marks
    public double calculateAverage(int mark1, int mark2, int mark3) {
        return calculateTotal(mark1, mark2, mark3) / 3.0;
    }

    // Calculate grade based on average
    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
