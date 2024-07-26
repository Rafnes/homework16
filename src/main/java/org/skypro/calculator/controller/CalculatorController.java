package org.skypro.calculator.controller;

import org.skypro.calculator.calculatorservice.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.plus(num1, num2);
        } else {
            return calculatorService.insufficientParamsError();
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.minus(num1, num2);
        } else {
            return calculatorService.insufficientParamsError();
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.multiply(num1, num2);
        } else {
            return calculatorService.insufficientParamsError();
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return calculatorService.insufficientParamsError();
        }
        if (num2 == 0) {
            return calculatorService.divisionByZeroError();
        }
        return calculatorService.divide(num1, num2);
    }
}
