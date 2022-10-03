package com.plat.mvs.repository.repository;

import com.plat.mvs.repository.entities.Vms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VmsRepository extends JpaRepository<Vms, Long> {
}
