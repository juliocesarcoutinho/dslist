package com.topone.dslist;

import com.topone.dslist.dto.GameMinDTO;
import com.topone.dslist.entities.Game;
import com.topone.dslist.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class resources {

    private final GameService service;
    public resources(GameService service) {
        this.service = service;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return service.findAll();
    }
}
