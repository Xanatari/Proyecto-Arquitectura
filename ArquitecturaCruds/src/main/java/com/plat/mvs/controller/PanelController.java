package com.plat.mvs.controller;


import com.plat.mvs.repository.entities.Vms;
import com.plat.mvs.services.VmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/panel")
public class PanelController {


    @Autowired
    VmsService vmsService;

    @GetMapping(value = "/healthCheck")
    public ResponseEntity healthCheck (){
        return  ResponseEntity.ok(HttpStatus.OK);
    }


    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheck (@RequestBody Vms vms){
        vmsService.newVms(vms);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping(value =  "/update")
    public ResponseEntity updatePanelvms(@RequestBody Vms vms){
        vmsService.updateVms(vms);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(value =  "/getVmsbyId/{id}")
    public ResponseEntity getVmsById(@PathVariable Long id){
        return ResponseEntity.ok(vmsService.getVmsbyId(id));
    }

}
