package com.plat.mvs.services;

import com.plat.mvs.repository.entities.Sensor;
import com.plat.mvs.repository.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    SensorRepository sensorRepository;


    public void newSensor(Sensor sensor){
        sensorRepository.save(sensor);
    }

    public void updateSensor(Sensor sensor){
        sensorRepository.save(sensor);
    }
    public Sensor getSensorbyId(Long id){
        Optional<Sensor> sensor = sensorRepository.findById(id);
        return sensor.get();
    }
}
