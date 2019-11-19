package com.heron.graphql.service;

import graphql.ExecutionResult;

/**
 * Created by heron.lee 2019-11-18
 */
public interface CoffeeService {
    ExecutionResult execute (String query);
}
