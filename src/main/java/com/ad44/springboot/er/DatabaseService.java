package com.ad44.springboot.er;

import POJOs.Consultant;
import POJOs.Job;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
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


}
