package com.ad44.springboot.er.dao;


import com.ad44.springboot.er.dao.POJOs.Order;
import com.ad44.springboot.er.dao.POJOs.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {


    private OrderRepo oR;


    @Autowired
    public DatabaseService(OrderRepo oR) {
       this.oR = oR;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void addSomeExampleOrders(){

        Order o1 = new Order("kamera1","miasto1","opis1");
        Order o2 = new Order("kamera2","miasto2","opis2");

        oR.save(o1);
        oR.save(o2);

    }

    public Iterable<Order> getAllOrders(){
        Iterable<Order> all = oR.findAll();

        return all;
    }

    public boolean addOrder(Order o1){
        oR.save(o1);
        return true;
    }


    public boolean deleteOrder(int index){
        oR.deleteById(index);
        return true;
    }



}
