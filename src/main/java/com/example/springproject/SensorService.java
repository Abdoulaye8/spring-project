package com.example.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }
    public Sensor getSensorById(int id) {
        return sensorRepository.findById(id);
    }
    public Sensor updateSensor(int id, String newName) {
        return sensorRepository.updateSensor(id, newName);
    }
    public Sensor createSensor(String name) {
        return sensorRepository.saveSensor(name);
    }
    public Sensor deleteSensor(int id) {
        return sensorRepository.deleteSensor(id);
    }




}
