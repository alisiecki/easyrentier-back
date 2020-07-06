package com.ad44.springboot.er.dao;

import com.ad44.springboot.er.dao.POJOs.Consultant;
import com.ad44.springboot.er.dao.POJOs.Job;
import com.ad44.springboot.er.dao.POJOs.Order;
import com.ad44.springboot.er.dao.POJOs.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class DatabaseService {


    static List<Job> jobs = new ArrayList<>();
    static List<Consultant> consultants = new ArrayList<>();

    static{
        jobs.add(new Job(1,"Czestochowa","ul. Palmowa 1/9a m.10", "notatka1"));
        jobs.add(new Job(2,"Czestochowa","ul. Palmowa 1/9a m.10", "notatka2"));

        consultants.add(new Consultant(1,"Jan","Kowalski", "kamera1", "Kierownik Budowy", new String[]{"slaskie", "malopolskie"}));
        consultants.add(new Consultant(2,"Adrzej","Nowak", "kamera2", "Inspektor Budowy", new String[]{"slaskie", "malopolskie"}));

    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJob(Job job) {
        jobs.add(job);
    }

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultant(Consultant consultant) {
        consultants.add(consultant);
    }








    private OrderRepo oR;

    @Autowired
    public DatabaseService(OrderRepo oR) {
       this.oR = oR;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void runExample2(){

        Order o1 = new Order("kamera1","miasto1","opis1");
        Order o2 = new Order("kamera2","miasto2","opis2");

        oR.save(o1);
        oR.save(o2);

        //Iterable<Order> all = oR.findAll();
        List<Order> all = (List<Order>) oR.findAll();
        all.forEach(System.out::println);
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
