package com.blauwmaan.webflux.springwebflux.repository;

import com.blauwmaan.webflux.springwebflux.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository <Vendor, String>{
}

