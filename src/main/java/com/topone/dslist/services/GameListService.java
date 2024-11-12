package com.topone.dslist.services;

import com.topone.dslist.dto.GameListDTO;
import com.topone.dslist.entities.GameList;
import com.topone.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository repository;

    public GameListService(GameListRepository repository) {
        this.repository = repository;
    }

    // Get all List Games
    public List<GameListDTO> findAll() {
        List<GameList> result = repository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

    // Get List Game by id
    public GameListDTO findById(Long id) {
        GameList entity = repository.findById(id).orElseThrow();
        return new GameListDTO(entity);
    }

}
