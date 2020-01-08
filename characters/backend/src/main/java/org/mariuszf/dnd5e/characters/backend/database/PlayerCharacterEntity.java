package org.mariuszf.dnd5e.characters.backend.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlayerCharacterEntity {

    @Id
    @GeneratedValue
    private Long id;

    public PlayerCharacterEntity() {
    }

    public Long getId() {
        return id;
    }
}
