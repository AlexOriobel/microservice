package com.test.spring_test.dao;

import com.test.spring_test.model.OrderS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OrdersRepository extends CrudRepository<OrderS, Long> {
}
