package com.example.imagevault.ImageRepositoryPackage;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ImageVault")
public class Image {
    @Id
    private String id;

    private String title;

    private Binary pic;

    public Image(String title) {
        super();
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Binary getPic() {
        return pic;
    }

    public void setPic(Binary image) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Photo [id=" + id + ", title=" + title + ", pic=" + pic + "]";
    }

}
