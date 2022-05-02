package com.blauwmaan.webflux.springwebflux.repository;

import com.blauwmaan.webflux.springwebflux.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository <Category, String> {
}
