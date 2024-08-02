package com.calculator.controller;

import com.calculator.CalculationRequest;
import com.calculator.CalculationResponse;
import com.calculator.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<CalculationResponse> calculate(@RequestBody CalculationRequest request) {
        double result = calculatorService.performOperation(request);
        calculatorService.serializeToAvro(request, result);

        // Wrap the result in a CalculationResponse
        CalculationResponse response = new CalculationResponse(result);

        // Return the ResponseEntity with the wrapped result
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}


