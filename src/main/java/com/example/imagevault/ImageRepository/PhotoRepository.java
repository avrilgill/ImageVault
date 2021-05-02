package com.example.imagevault.ImageRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Image, String> {

}
