package com.heron.graphql.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.Lists;
import com.heron.graphql.model.Coffee;
import com.heron.graphql.repository.CoffeeRepository;

/**
 * Created by heron.lee 2019-11-19
 */
@Component
public class CoffeeQuery implements GraphQLQueryResolver {

    private final CoffeeRepository coffeeRepository;

    public CoffeeQuery(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getCoffees () {
        return Lists.newArrayList(coffeeRepository.findAll());
    }

    public Coffee getCoffee (int id) {
        return coffeeRepository.findById(id).orElse(null);
    }
}
