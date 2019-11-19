package com.heron.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.heron.graphql.model.Coffee;
import com.heron.graphql.repository.CoffeeRepository;

/**
 * Created by heron.lee 2019-11-19
 */
@Component
public class CoffeeMutation implements GraphQLMutationResolver {

    private final CoffeeRepository coffeeRepository;

    public CoffeeMutation(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public Coffee postCoffee (String name, int price) {
        Coffee coffee = new Coffee();
        coffee.setName(name);
        coffee.setPrice(price);
        return coffeeRepository.save(coffee);
    }
}
