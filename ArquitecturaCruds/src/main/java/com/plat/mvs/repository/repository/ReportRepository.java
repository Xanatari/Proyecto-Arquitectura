package com.plat.mvs.repository.repository;

import com.plat.mvs.repository.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}