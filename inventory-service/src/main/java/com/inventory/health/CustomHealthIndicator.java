package com.inventory.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isHealthy = checkSomeService();
        if (isHealthy) {
            return Health.up().build();
        } else {
            return Health.down().withDetail("Error", "Service is down").build();
        }
    }

    private boolean checkSomeService() {
        return true;
    }
}