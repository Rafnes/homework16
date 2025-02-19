package org.skypro.calculator.calculatorservice;

public interface CalculatorService {
    String hello();

    String plus(int num1, int num2);

    String minus(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);

    String insufficientParamsError();

    String divisionByZeroError();
}
