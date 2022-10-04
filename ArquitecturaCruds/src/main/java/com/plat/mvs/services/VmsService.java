package com.plat.mvs.services;

import com.plat.mvs.repository.entities.Vms;
import com.plat.mvs.repository.repository.VmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VmsService {

    @Autowired
    VmsRepository vmsRepository;


    public void newVms(Vms vms){
        vmsRepository.save(vms);
    }

    public void updateVms(Vms vms){
        vmsRepository.save(vms);
    }

    public Vms getVmsbyId(Long id){
        Optional<Vms> vms = vmsRepository.findById(id);
        return vms.get();
    }
}
