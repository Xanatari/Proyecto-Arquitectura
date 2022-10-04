package com.plat.mvs.controller;

import com.plat.mvs.repository.entities.Sensor;
import com.plat.mvs.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sensor")
public class SensorController {

    @Autowired
    SensorService sensorService;

    @GetMapping(value = "/healthCheck")
    public ResponseEntity healthCheck (){
        return  ResponseEntity.ok(HttpStatus.OK);
    }


    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity newSensor (@RequestBody Sensor sensor){
        sensorService.newSensor(sensor);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping(value =  "/update")
    public ResponseEntity updateSensor(@RequestBody Sensor sensor){
        sensorService.updateSensor(sensor);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(value =  "/getSensorbyId/{id}")
    public ResponseEntity getSensorById(@PathVariable Long id){
        return ResponseEntity.ok(sensorService.getSensorbyId(id));
    }

}
