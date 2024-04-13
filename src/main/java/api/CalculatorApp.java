package api;

import com.fasterxml.jackson.databind.ObjectMapper; // Import Jackson library for JSON parsing

public class CalculatorApp {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        // Example JSON input
        String jsonInput = "{\"operation\": \"add\", \"number1\": 10, \"number2\": 5}";

        // Parse JSON input
        CalculationRequest request = mapper.readValue(jsonInput, CalculationRequest.class);

        // Perform the operation
        double result = performOperation(request);

        // Serialize the operation and result to Avro format for logging
        serializeToAvro(request, result);
    }

    private static double performOperation(CalculationRequest request) {
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

    private static void serializeToAvro(CalculationRequest request, double result) {
        // Avro serialization logic goes here
    }
}
