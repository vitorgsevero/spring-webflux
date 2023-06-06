package com.apirest.webflux.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "playlist")
public class Playlist {

    @Id
    private String id;
    private String name;

    public Playlist(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
