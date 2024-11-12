package com.topone.dslist.services;

import com.topone.dslist.dto.GameDTO;
import com.topone.dslist.dto.GameMinDTO;
import com.topone.dslist.entities.Game;
import com.topone.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    // Get all games
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    // Get game by id
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game entity = repository.findById(id).orElseThrow();
        return new GameDTO(entity);
    }
}
