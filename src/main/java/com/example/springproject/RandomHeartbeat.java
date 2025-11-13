package com.example.springproject;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomHeartbeat implements HeartbeatSensor {
    private Random random = new Random();
    @Override
    public int get() {
        return 40 + random.nextInt(191);
    }
}
