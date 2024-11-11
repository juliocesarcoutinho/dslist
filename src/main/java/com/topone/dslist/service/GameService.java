package com.topone.dslist.service;

import com.topone.dslist.dto.GameMinDTO;
import com.topone.dslist.entities.Game;
import com.topone.dslist.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
