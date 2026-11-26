package com.bakery;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BakingRepository extends MongoRepository<Baking, String> {
}