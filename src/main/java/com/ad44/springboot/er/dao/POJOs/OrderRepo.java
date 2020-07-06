package com.ad44.springboot.er.dao.POJOs;

import com.ad44.springboot.er.dao.POJOs.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Order, Integer> {
}
