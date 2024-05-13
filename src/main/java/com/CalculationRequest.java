package com;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CalculationRequest {
    private String operation;
    private double number1;
    private double number2;
}
