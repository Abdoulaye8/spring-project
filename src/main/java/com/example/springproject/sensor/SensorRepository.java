package com.example.springproject.sensor;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class SensorRepository {
    private Map<Integer, Sensor> sensors = new HashMap<>();

    public SensorRepository() {
        //  capteurs
        sensors.put(1, new Sensor(1, "montre"));
        sensors.put(2, new Sensor(2, "ceinture"));
        sensors.put(3, new Sensor(3, "cardio"));
    }

    public List<Sensor> findAll() {
        return new ArrayList<>(sensors.values());
    }
    public Sensor findById(int id) {
        return sensors.get(id);
    }
    public Sensor updateSensor(int id, String newName) {
        Sensor sensor = sensors.get(id);
        if (sensor != null) {
            sensor.setName(newName);
        }
        return sensor;
    }
    private int nextId = 4; // commence après les capteurs existants

    public Sensor saveSensor(String name) {
        Sensor sensor = new Sensor(nextId, name);
        sensors.put(nextId, sensor);
        nextId++;
        return sensor;
    }
    public Sensor deleteSensor(int id) {
        return sensors.remove(id); // supprime et renvoie le capteur supprimé, ou null si pas trouvé
    }




}
