package com.ad44.springboot.er;


import com.ad44.springboot.er.dao.POJOs.Job;
import com.ad44.springboot.er.dao.DatabaseService;
import com.ad44.springboot.er.dao.POJOs.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8081"})
@RestController("/")
public class MyRestController {

    @Autowired
    DatabaseService databaseService;


    @GetMapping("/jobs/all")
    public List<Job> getAllJobs(){

        return databaseService.getJobs();
    }


    @GetMapping("/getallorders")
    public Iterable<Order> getAllOrders(){

        return databaseService.getAllOrders();
    }

    @PostMapping
    public boolean makeOrder(@RequestBody Order order){

        return databaseService.addOrder(order);
    }

    @DeleteMapping
    public boolean deleteOrder(@RequestParam int index){

     return databaseService.deleteOrder(index);
    }









}
