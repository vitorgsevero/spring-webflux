package com.apirest.webflux.controller;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.services.PlaylistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    PlaylistServiceImpl service;

    @GetMapping
    public Flux<Playlist> getPlaylist() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Playlist> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Playlist> savePlaylist(@RequestBody Playlist playlist) {
        return service.save(playlist);
    }

}
