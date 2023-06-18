package com.apirest.webflux.services;

import com.apirest.webflux.document.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    PlaylistService playlistService;

    @Override
    public Flux<Playlist> findAll() {
        return playlistService.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return playlistService.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return playlistService.save(playlist);
    }

}
