package com.heron.graphql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heron.graphql.model.Coffee;

/**
 * Created by heron.lee 2019-11-18
 */
@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Integer> {
}
