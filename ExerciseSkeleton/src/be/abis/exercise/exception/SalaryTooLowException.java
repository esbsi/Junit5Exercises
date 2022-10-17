package be.abis.exercise.exception;

public class SalaryTooLowException extends Exception{
    public SalaryTooLowException() {
        super("Salary too low");
    }
    public SalaryTooLowException(String message) {
        super(message);
    }
}
