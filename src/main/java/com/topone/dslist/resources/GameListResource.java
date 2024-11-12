package com.topone.dslist.resources;

import com.topone.dslist.dto.GameListDTO;
import com.topone.dslist.services.GameListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListResource {

    private final GameListService gameListService;

    public GameListResource(GameListService gameListService){
        this.gameListService = gameListService;
    }

    // Get all List Games
    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    // Get List Game by id
    @GetMapping("/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return gameListService.findById(id);
    }

}
