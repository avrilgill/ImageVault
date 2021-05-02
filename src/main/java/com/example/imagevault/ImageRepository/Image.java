package com.example.imagevault.ImageRepository;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ImageVault")
public class Image {
    @Id
    private String id;

    private String title;

    private Binary image;
}