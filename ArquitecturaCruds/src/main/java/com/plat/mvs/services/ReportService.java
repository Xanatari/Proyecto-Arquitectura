package com.plat.mvs.services;

import com.plat.mvs.repository.entities.Report;
import com.plat.mvs.repository.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;

    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

    public Report createReport(Report newReport){
        return reportRepository.save(newReport);
    }

    public Report updateReport(Report newReport){
        Optional<Report> optionalReport = reportRepository.findById(newReport.getId());
        if(!optionalReport.isPresent()){
            return null;
        }
        Report storedReport = optionalReport.get();
        storedReport.setId(newReport.getId());
        storedReport.setFecha(newReport.getFecha());
        storedReport.setTipoEvento(newReport.getTipoEvento());
        storedReport.setIdCreador(newReport.getIdCreador());
        return reportRepository.save(storedReport);
    }

    public String deleteReport(Long reportId){
        reportRepository.deleteById(reportId);
        return "El reporte " + reportId + " ha sido eliminado";
    }
}
