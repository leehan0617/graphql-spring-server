package com.heron.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.heron.graphql.model.Coffee;
import com.heron.graphql.model.SimpleResponse;
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
        Coffee coffee = new Coffee(name, price);
        return coffeeRepository.save(coffee);
    }

    public Coffee updateCoffee (int id, String name, int price) {
        Coffee coffee = new Coffee(id, name, price);
        return coffeeRepository.save(coffee);
    }

    public SimpleResponse deleteCoffee (int id) {
        SimpleResponse response = new SimpleResponse();
        response.setMessage("OK");
        coffeeRepository.findById(id)
                        .ifPresentOrElse(coffeeRepository::delete, () -> {
                            System.out.println("존재하지 않는 커피 입니다.");
                            response.setMessage("FAIL");
                        });
        return response;
    }
}
