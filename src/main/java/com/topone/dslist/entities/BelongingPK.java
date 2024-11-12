package com.topone.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;

        return getGame().equals(that.getGame()) && getList().equals(that.getList());
    }

    @Override
    public int hashCode() {
        int result = getGame().hashCode();
        result = 31 * result + getList().hashCode();
        return result;
    }
}
