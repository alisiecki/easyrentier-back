package com.ad44.springboot.er;


import com.ad44.springboot.er.dao.DatabaseService;
import com.ad44.springboot.er.dao.POJOs.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"https://easyrentier-front.herokuapp.com"})
@RestController("/")
public class MyRestController {

    @Autowired
    DatabaseService databaseService;


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
