package com.ad44.springboot.er;


import POJOs.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class MyRestController {


    DatabaseService databaseService = new DatabaseService();



    @GetMapping("/jobs/all")
    public List<Job> getAllJobs(){

        return databaseService.getJobs();
    }








}
