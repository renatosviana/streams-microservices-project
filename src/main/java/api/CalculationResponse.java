package api;

import lombok.Data;

@Data
public class CalculationResponse {
    private double result;

    public CalculationResponse(double result) {
        this.result = result;
    }
}

