package com.example.springproject.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @GetMapping("/sensors")
    public List<Sensor> getAllSensors() {
        return sensorService.getAllSensors();
    }
    @GetMapping("/sensors/{id}")
    public Sensor getSensorById(@PathVariable int id) {
        return sensorService.getSensorById(id);
    }
    @PutMapping("/sensors/{id}")
    public Sensor updateSensor(@PathVariable int id, @RequestBody Sensor sensor) {
        return sensorService.updateSensor(id, sensor.getName());
    }
    @PostMapping("/sensors")
    public Sensor createSensor(@RequestBody Sensor sensor) {
        return sensorService.createSensor(sensor.getName());
    }
    @DeleteMapping("/sensors/{id}")
    public Sensor deleteSensor(@PathVariable int id) {
        return sensorService.deleteSensor(id);
    }




}
