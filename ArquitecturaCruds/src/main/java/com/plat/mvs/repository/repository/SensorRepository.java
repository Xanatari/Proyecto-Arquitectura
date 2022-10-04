package com.plat.mvs.repository.repository;

import com.plat.mvs.repository.entities.Sensor;
import com.plat.mvs.repository.entities.Vms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {

}
