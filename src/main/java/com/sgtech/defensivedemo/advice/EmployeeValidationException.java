package com.sgtech.defensivedemo.advice;

public class EmployeeValidationException extends RuntimeException {
    public EmployeeValidationException(String message) {
        super(message);
    }
}
