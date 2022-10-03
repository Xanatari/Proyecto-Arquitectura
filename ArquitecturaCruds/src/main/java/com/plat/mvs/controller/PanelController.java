package com.plat.mvs.controller;


import com.plat.mvs.repository.entities.Vms;
import com.plat.mvs.repository.repository.VmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/panel")
public class PanelController {


    @Autowired
    VmsRepository vmsRepository;

    @GetMapping(value = "/healthCheck")
    public ResponseEntity healthCheck (){
        return  ResponseEntity.ok(HttpStatus.OK);
    }


    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheck (@RequestBody Vms vms){

        vmsRepository.save(vms);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
