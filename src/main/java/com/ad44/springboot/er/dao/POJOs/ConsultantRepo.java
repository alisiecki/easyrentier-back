package com.ad44.springboot.er.dao.POJOs;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepo extends CrudRepository<Consultant,Long> {
}
