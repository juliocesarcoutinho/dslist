package com.topone.dslist.dto;

import com.topone.dslist.entities.GameList;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
