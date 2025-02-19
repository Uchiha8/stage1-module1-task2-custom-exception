package com.epam.mjc.utils;

public class StudentNotFoundException extends IllegalArgumentException {

  public StudentNotFoundException(long studentID) {
    super("Could not find student with ID " + studentID);
  }
}
