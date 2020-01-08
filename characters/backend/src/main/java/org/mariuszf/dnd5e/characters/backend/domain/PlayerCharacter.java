package org.mariuszf.dnd5e.characters.backend.domain;

public class PlayerCharacter {

    private Long id;


    public PlayerCharacter(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
