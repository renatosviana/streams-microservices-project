package api.service;

import api.CalculationRequest;
import api.CalculatorAPI;
import api.SimpleCalculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final CalculatorAPI calculator = new SimpleCalculator();

    public double performOperation(CalculationRequest request) {
        CalculatorAPI calculator = new SimpleCalculator();
        switch (request.getOperation()) {
            case "add":
                return calculator.add(request.getNumber1(), request.getNumber2());
            case "subtract":
                return calculator.subtract(request.getNumber1(), request.getNumber2());
            case "multiply":
                return calculator.multiply(request.getNumber1(), request.getNumber2());
            case "divide":
                return calculator.divide(request.getNumber1(), request.getNumber2());
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public void serializeToAvro(CalculationRequest request, double result) {
        // Avro serialization logic goes here
    }

}
