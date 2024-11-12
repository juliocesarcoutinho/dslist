package com.topone.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_belonging")
@EqualsAndHashCode(of = "id")
@Data
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(Game game, GameList list, Integer position) {
        this.id.setGame(game);
        this.id.setList(list);
        this.position = position;
    }
    public Belonging() {}
}
