package com.plat.mvs.controller;

import com.plat.mvs.repository.entities.Message;
import com.plat.mvs.repository.entities.Report;
import com.plat.mvs.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping(value = "/get")
    public List<Report> getAllMessages(){
        return reportService.getAllReports();
    }

    @PostMapping(value = "/createReport")
    public Report addMessage(@RequestBody Report report){
        return reportService.createReport(report);
    }

    @PutMapping(value = "/editReport")
    public Report updateMessage(Report report){
        return reportService.updateReport(report);
    }

    @DeleteMapping(value="/delReport/{id}")
    public String deleteMessageById(@PathVariable Long id){
        return reportService.deleteReport(id);
    }


}
