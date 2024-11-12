package com.topone.dslist.dto;

import com.topone.dslist.entities.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String genre;
    private String platforms;
    private Double score;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
