package org.mariuszf.dnd5e.characters.backend.web;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PlayerCharacterCreateDTO {

    @NotNull private String race;
    @NotNull private String subRace;
    @NotNull private String characterClass;
    @NotNull private String characterSubClass;

    public PlayerCharacterCreateDTO(@Valid String race,
                                    @Valid String subRace,
                                    @Valid String characterClass,
                                    @Valid String characterSubClass) {
        this.race = race.toLowerCase();
        this.subRace = subRace.toLowerCase();
        this.characterClass = characterClass.toLowerCase();
        this.characterSubClass = characterSubClass.toLowerCase();
    }

    public String getRace() {
        return race;
    }

    public String getSubRace() {
        return subRace;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public String getCharacterSubClass() {
        return characterSubClass;
    }
}
