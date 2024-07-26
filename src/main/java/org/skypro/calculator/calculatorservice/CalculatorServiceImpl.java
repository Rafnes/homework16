package org.skypro.calculator.calculatorservice;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String insufficientParamsError() {
        return "Не подан один из параметров (или оба)";
    }

    public String divisionByZeroError() {
        return "Нельзя делить на 0";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        int result = num1 / num2;
        int remainder = num1 % num2;
        if (remainder == 0) {
            return num1 + " / " + num2 + " = " + result;
        } else {
            return num1 + " / " + num2 + " = " + result + ", остаток " + remainder;
        }
    }
}
